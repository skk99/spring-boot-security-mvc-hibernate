package com.shankarstudy.app07.controller;

import com.shankarstudy.app07.beans.Employee;
import com.shankarstudy.app07.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    public Employee addEmployee(Employee employee){
        Employee employee1 = employeeService.addEmployee(employee);
        return employee1;
    }
    public Employee searchEmployee(int eno){
        Employee employee = employeeService.searchEmployee(eno);
        return employee;
    }

    public Iterable<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }
    public Employee updateEmployee(Employee employee){
        return employeeService.updateEmployee(employee);
    }

    public String deleteEmployee(int eno){
        return employeeService.deleteEmployee(eno);
    }
}
