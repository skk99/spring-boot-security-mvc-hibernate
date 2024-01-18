package com.shankarstudy.app06.dao;

import com.shankarstudy.app06.beans.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDaoImpl implements EmployeeDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public String add(Employee employee) {
        String status = "";
        String query = "insert into employee values("+employee.getEno()+",'"+
                employee.getEname()+"',"+employee.getEsal()+",'"+employee.getEaddr()+"')";
        int rowCount = jdbcTemplate.update(query);
        if (rowCount == 1) {
            status = "SUCCESS";
        }
        else {
            status = "FAILURE";
        }
        return status;
    }

    @Override
    public Employee search(int eno) {
        List<Employee> employeeList = jdbcTemplate.query("select * from employee where ENO = "+eno, (rs, num)->{
            Employee employee = new Employee();
            employee.setEno(rs.getInt("ENO"));
            employee.setEname(rs.getString("ENAME"));
            employee.setEsal(rs.getFloat("ESAL"));
            employee.setEaddr(rs.getString("EADDR"));
            return employee;
        } );

        return employeeList.isEmpty()?null:employeeList.get(0);
    }

    @Override
    public String update(Employee employee) {
        String status = "";
        Employee emp = search(employee.getEno());
        if (emp == null) {
            status = "Employee Does not Exist";
        } else {
            String query = "update employee set ENAME = '" + employee.getEname() + "', ESAL = " +
                    employee.getEsal() + ", EADDR = '" + employee.getEaddr() + "' where ENO = " + employee.getEno();
            int rowCount = jdbcTemplate.update(query);
            if (rowCount == 1) {
                status = "SUCCESS";
            } else {
                status = "FAILURE";
            }

        }
        return status;
    }

    @Override
    public String delete(int eno) {
        Employee employee = search(eno);
        String status = "";
        if(employee == null){
            status = "Employee Does Not Exist";
        }else{
            int rowCount = jdbcTemplate.update("delete from employee where ENO = "+eno);
            if(rowCount == 1){
                status = "SUCCESS";
            }else{
                status = "FAILURE";
            }
        }
        return status;
    }
}
