package com.luv2code.springboot.thymeleafdemo.dao;

import com.luv2code.springboot.thymeleafdemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // that's it ... no need to write any code LOL!

    // add method to sort by last name, spring data jpa will parse the method name
    // looks for a specific format and pattern and creates appropriate query... behind the scenes
    // "from Employee order by lastName asc"
    public List<Employee> findAllByOrderByLastNameAsc();

}
