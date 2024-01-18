package com.shankastudy.h2demo.repository;

import com.shankastudy.h2demo.beans.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
