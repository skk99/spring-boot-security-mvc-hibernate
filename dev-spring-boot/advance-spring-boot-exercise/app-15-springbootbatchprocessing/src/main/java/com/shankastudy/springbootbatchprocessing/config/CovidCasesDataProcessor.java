package com.shankastudy.springbootbatchprocessing.config;

import com.shankastudy.springbootbatchprocessing.entities.CovidCases;
import org.springframework.batch.item.ItemProcessor;

public class CovidCasesDataProcessor implements ItemProcessor<CovidCases, CovidCases> {
    @Override
    public CovidCases process(CovidCases item) throws Exception {
        item.setCountry(item.getCountry().toUpperCase());
        return item;
    }
}
