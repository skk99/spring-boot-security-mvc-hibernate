package com.shankarstudy.app07.service;

import com.shankarstudy.app07.beans.Employee;

public interface EmployeeService {
    public Employee addEmployee(Employee employee);
    public Employee searchEmployee(int eno);
    public Iterable getAllEmployees();
    public Employee updateEmployee(Employee employee);
    public String deleteEmployee(int eno);


}
