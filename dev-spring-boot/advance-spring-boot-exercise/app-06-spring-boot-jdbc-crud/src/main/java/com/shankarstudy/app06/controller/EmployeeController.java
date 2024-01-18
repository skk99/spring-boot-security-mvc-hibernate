package com.shankarstudy.app06.controller;

import com.shankarstudy.app06.beans.Employee;
import com.shankarstudy.app06.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    public String addEmployee(Employee employee){
        String status = "";
        status = employeeService.addEmployee(employee);
        return status;
    }
    public Employee searchEmployee(int eno){
        Employee employee = employeeService.searchEmployee(eno);
        return employee;
    }
    public String updateEmployee(Employee employee){
        String status = employeeService.updateEmployee(employee);
        return status;
    }
    public String deleteEmployee(int eno){
        String status = employeeService.deleteEmployee(eno);
        return status;
    }
}
