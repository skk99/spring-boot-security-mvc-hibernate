package com.shankarstudy.app09.runner;

import com.shankarstudy.app09.bean.Student;
import com.shankarstudy.app09.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

@Component
public class StudentRunner implements CommandLineRunner {
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception {
        /*
        Sort sort = Sort.by(Sort.Direction.fromString("ASC"),"saddr");
        Iterable iterable = studentRepository.findAll(sort);
        iterable.forEach(System.out::println);
         */

        /*
        PageRequest pageRequest = PageRequest.of(0,3);
        Page<Student> page = studentRepository.findAll(pageRequest);
        page.forEach(System.out::println);
         */


        PageRequest pageRequest = PageRequest.of(0,3, Sort.Direction.fromString("DESC"), "saddr");
        Page<Student> page = studentRepository.findAll(pageRequest);
        page.forEach(System.out::println);
         

    }
}
