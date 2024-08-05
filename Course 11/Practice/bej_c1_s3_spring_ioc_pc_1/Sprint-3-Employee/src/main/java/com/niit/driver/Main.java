package com.niit.driver;

import com.niit.config.SpringConfig;
import com.niit.model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        Employee employee1 = (Employee) context.getBean("employee1");
        System.out.println("Employee Name :: "+employee1.getName());
        System.out.println("Employee DOB :: "+employee1.getEmployeeDOB());
        System.out.println("Department ID :: "+employee1.getDepartment().getDeptId());
        System.out.println("Department Name :: "+employee1.getDepartment().getDeptName());



    }
}
