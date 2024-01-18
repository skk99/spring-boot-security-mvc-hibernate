package com.shankastudy.springbootbatchprocessing.config;

import com.shankastudy.springbootbatchprocessing.entities.CovidCases;
import com.shankastudy.springbootbatchprocessing.repository.CovidCasesRepository;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.item.data.RepositoryItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.LineMapper;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
public class SpringBatchConfig {

    @Autowired
    private CovidCasesRepository covidCasesRepository;

    @Autowired
    private JobRepository jobRepository;

    @Autowired
    private PlatformTransactionManager platformTransactionManager;

    @Bean
    public FlatFileItemReader<CovidCases> itemReader() {

        FlatFileItemReader<CovidCases> flatFileItemReader = new FlatFileItemReader<>();
        flatFileItemReader.setResource(new FileSystemResource("C:\\Users\\shakarn\\Shan\\Code\\advance-spring-boot-exercise\\covid_cases.csv"));
        flatFileItemReader.setLinesToSkip(1);
        flatFileItemReader.setLineMapper(lineMapper());
        return flatFileItemReader;
    }

    // @Bean
    public CovidCasesDataProcessor itemprocessor() {

        return new CovidCasesDataProcessor();
    }

    public RepositoryItemWriter<CovidCases> itemWriter() {

        RepositoryItemWriter<CovidCases> repositoryItemWriter = new RepositoryItemWriter<>();
        repositoryItemWriter.setRepository(covidCasesRepository);
        repositoryItemWriter.setMethodName("save");
        return repositoryItemWriter;
    }

    @Bean
    public Step covidCasesStep(JobRepository jobRepository, PlatformTransactionManager platformTransactionManager) {

        return new StepBuilder("covidCasesStep", jobRepository)
                .<CovidCases, CovidCases>chunk(10, platformTransactionManager)
                .reader(itemReader())
                .processor(itemprocessor())
                .writer(itemWriter())
                .build();
    }

    @Bean
    public Job runJob(JobRepository jobRepository) {

        return new JobBuilder("csv-job", jobRepository)
                .flow(covidCasesStep(jobRepository, platformTransactionManager))
                .end().build();
    }

    private LineMapper<CovidCases> lineMapper() {

        DefaultLineMapper<CovidCases> defaultLineMapper = new DefaultLineMapper<>();

        DelimitedLineTokenizer delimitedLineTokenizer = new DelimitedLineTokenizer();
        delimitedLineTokenizer.setDelimiter(",");
        delimitedLineTokenizer.setStrict(false);
        delimitedLineTokenizer.setNames("Countries","Confirmed", "Deaths", "Recovered", "Active");

        BeanWrapperFieldSetMapper<CovidCases> beanWrapperFieldSetMapper = new BeanWrapperFieldSetMapper<>();
        beanWrapperFieldSetMapper.setTargetType(CovidCases.class);

        defaultLineMapper.setLineTokenizer(delimitedLineTokenizer);
        defaultLineMapper.setFieldSetMapper(beanWrapperFieldSetMapper);

        return defaultLineMapper;
    }
}
