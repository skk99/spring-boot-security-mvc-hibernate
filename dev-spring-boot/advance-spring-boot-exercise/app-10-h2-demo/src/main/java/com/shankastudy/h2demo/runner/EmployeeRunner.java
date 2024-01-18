package com.shankastudy.h2demo.runner;

import com.shankastudy.h2demo.beans.Employee;
import com.shankastudy.h2demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class EmployeeRunner implements CommandLineRunner {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Transactional
    @Override
    public void run(String... args) throws Exception {
        Employee employee = new Employee();
        employee.setEname("Nag");
        employee.setEsal(6000);
        employee.setEaddr("Chennai");
        Employee emp = employeeRepository.save(employee);
        // System.out.println(emp);

        Employee emp1 = employeeRepository.findById(1).get();
        System.out.println(emp1);

        emp1.setEname("Ramesh");
        emp1.setEsal(9999);
        emp1.setEaddr("Pune");
        Employee emp2 = employeeRepository.findById(1).get();
        System.out.println(emp2);

//        employeeRepository.deleteById(1);

    }
}
