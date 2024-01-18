package com.shankarstudy.app07.runner;

import com.shankarstudy.app07.beans.Employee;
import com.shankarstudy.app07.controller.EmployeeController;
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


        Employee employee = new Employee();
        //employee.setEno(111);
        employee.setEname("Durga");
        employee.setEsal(5000);
        employee.setEaddr("Hyd");
        Employee emp = employeeController.addEmployee(employee);
        System.out.println(emp);

        /*
        Employee employee = employeeController.searchEmployee(1);
        System.out.println(employee);
        */
        /*
        Iterable<Employee> iterable = employeeController.getAllEmployees();
        Iterator<Employee> iterator = iterable.iterator();
        while (iterator.hasNext()){
            Employee employee = iterator.next();
            System.out.println(employee);
        }
        */
        /*
        Employee employee = new Employee();
        employee.setEno(3);
        employee.setEname("XXX");
        employee.setEsal(9000);
        employee.setEaddr("Chennai");
        Employee emp = employeeController.updateEmployee(employee);
        System.out.println(emp);
        if(emp.getEno() == employee.getEno()){
            System.out.println("SUCCESS");
        }else{
            System.out.println("FAILURE");
        }
        */
        /*
        String status = employeeController.deleteEmployee(5);
        System.out.println(status);
         */
    }
}
