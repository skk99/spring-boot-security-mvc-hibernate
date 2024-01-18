package com.luv2code.springboot.cruddemo.dao;

import com.luv2code.springboot.cruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // that's it ... no need to write any code
    // No need for implementation class as what we were doing in dao and daoimpl
    // we get below methods for free
    // findAll(), findById(), save(), deleteById()

}
