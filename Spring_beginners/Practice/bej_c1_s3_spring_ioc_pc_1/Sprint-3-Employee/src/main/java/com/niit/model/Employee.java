package com.niit.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
    private int employeeId;
    private String name;
    private String employeeDOB;

    @Autowired
    private Department department;

    public Employee() {
    }

    public Employee(int employeeId, String name, String employeeDOB) {
        this.employeeId = employeeId;
        this.name = name;
        this.employeeDOB = employeeDOB;
    }

    public Employee(int employeeId, String name, String employeeDOB, Department department) {
        this.employeeId = employeeId;
        this.name = name;
        this.employeeDOB = employeeDOB;
        this.department = department;
    }

    public Department getDepartment() {
        return department;
    }


    public void setDepartment(Department department) {
        this.department = department;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeDOB() {
        return employeeDOB;
    }

    public void setEmployeeDOB(String employeeDOB) {
        this.employeeDOB = employeeDOB;
    }
}
