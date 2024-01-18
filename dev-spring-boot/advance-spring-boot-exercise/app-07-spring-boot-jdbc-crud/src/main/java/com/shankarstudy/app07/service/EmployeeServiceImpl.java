package com.shankarstudy.app07.service;

import com.shankarstudy.app07.beans.Employee;
import com.shankarstudy.app07.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository theEmployeeRepository) {
        this.employeeRepository = theEmployeeRepository;
    }

    @Transactional
    @Override
    public Employee addEmployee(Employee employee) {
        Employee employee1 = employeeRepository.save(employee);
        return employee1;
    }

    @Override
    public Employee searchEmployee(int eno) {
        Optional<Employee> optional = employeeRepository.findById(eno);
        Employee employee = optional.get();
        return employee;

    }

    @Override
    public Iterable getAllEmployees() {
        Iterable<Employee> iterable = employeeRepository.findAll();
        return iterable;
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        Employee employee1 = employeeRepository.save(employee);
        return employee1;
    }

    @Override
    public String deleteEmployee(int eno) {
        employeeRepository.deleteById(eno);
        return "SUCCESS";
    }
}
