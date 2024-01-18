package com.shankarstudy.app04.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@PropertySource("classpath:employee.properties")
@RestController
public class EmployeeController {
    @Autowired
    private Environment environment;

    @RequestMapping("/emp")
    public String getEmpDetails(){
        String data = "<h1>Employee[";
//        data = data + environment.getProperty("employee.empNo")+",";
//        data = data + environment.getProperty("employee.empName")+",";
//        data = data + environment.getProperty("employee.empAddress")+"]</h1>";
        data = data + environment.getProperty("employee.eno")+",";
        data = data + environment.getProperty("employee.ename")+",";
        data = data + environment.getProperty("employee.esal")+",";
        data = data + environment.getProperty("employee.eaddr")+"]</h1>";

        return data;
    }
}
