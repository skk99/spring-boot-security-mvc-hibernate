package com.shankarstudy.app06.runner;

import com.shankarstudy.app06.beans.Employee;
import com.shankarstudy.app06.controller.EmployeeController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class EmployeeRunner implements ApplicationRunner {
    @Autowired
    private EmployeeController employeeController;


    @Override
    public void run(ApplicationArguments args) throws Exception {
        /*
        Employee employee = new Employee();
        employee.setEno(111);
        employee.setEname("Durga");
        employee.setEsal(5000);
        employee.setEaddr("Hyd");
        String status = employeeController.addEmployee(employee);
        System.out.println(status);
        */
        /*
        Employee employee = employeeController.searchEmployee(111);
        if(employee == null){
            System.out.println("Employee does not exist");
        }else{
            System.out.println("Employee Details");
            System.out.println("----------------------");
            System.out.println("Employee Number : "+employee.getEno());
            System.out.println("Employee Name : "+employee.getEname());
            System.out.println("Employee Salary : "+employee.getEsal());
            System.out.println("Employee Address : "+employee.getEaddr());
        }
        */
        /*
        Employee employee = new Employee();
        employee.setEno(111);
        employee.setEname("Anil");
        employee.setEsal(6000);
        employee.setEaddr("Chennai");
        String status = employeeController.updateEmployee(employee);
        System.out.println(status);
        */

        String status = employeeController.deleteEmployee(111);
        System.out.println(status);
         
    }
}
