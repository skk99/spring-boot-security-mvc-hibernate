package com.shankarstudy.app04.controller;

import com.shankarstudy.app04.beans.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@PropertySource("classpath:config/student.properties")
@RestController
public class StudentController {
    @Autowired
    private Student student;

    @RequestMapping("/std")
    public String getStdDetails(){
        String data = "<h1>Student[";
//        data = data + environment.getProperty("student.stdNo")+",";
//        data = data + environment.getProperty("student.stdName")+",";
//        data = data + environment.getProperty("student.stdAddress")+"]</h1>";
        data = data + student.getSid()+",";
        data = data + student.getSname()+",";
        data = data + student.getSemail()+",";
        data = data + student.getSmobile()+"]</h1>";
        return data;
    }
}
