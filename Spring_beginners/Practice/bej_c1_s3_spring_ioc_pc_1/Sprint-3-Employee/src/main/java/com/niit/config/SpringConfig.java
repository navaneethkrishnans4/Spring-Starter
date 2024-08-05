package com.niit.config;

import com.niit.model.Department;
import com.niit.model.Employee;
import org.springframework.context.annotation.Bean;

public class SpringConfig {

    @Bean("employee1")
    public Employee getEmployee1()
    {
        Employee employee = new Employee();
        employee.setEmployeeId(101);
        employee.setName("Adam");
        employee.setEmployeeDOB("25-10-1995");
        return employee;
    }

    @Bean("employee2")
    public Employee getEmployee2()
    {
        return new Employee(102,"John","28-02-1994", getDept());
    }

    @Bean
    public Department getDept()
    {
        return new Department("D001","Manager");
    }

}
