package com.shankarstudy.app06.service;

import com.shankarstudy.app06.beans.Employee;
import com.shankarstudy.app06.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public String addEmployee(Employee employee) {
        String status = employeeDao.add(employee);
        return status;
    }

    @Override
    public Employee searchEmployee(int eno) {
        Employee employee = employeeDao.search(eno);
        return employee;
    }

    @Override
    public String updateEmployee(Employee employee) {
        String status = employeeDao.update(employee);
        return status;
    }

    @Override
    public String deleteEmployee(int eno) {
        String status = employeeDao.delete(eno);
        return status;
    }
}
