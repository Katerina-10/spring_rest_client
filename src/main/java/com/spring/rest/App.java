package com.spring.rest;

import com.spring.rest.configuration.MyConfig;
import com.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class App
{
    public static void main( String[] args )
    {


        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = context.getBean("communication", Communication.class);
        List<Employee> listEmployees = communication.getAllEmployees();

        System.out.println(listEmployees);
        System.out.println("");

        Employee employee = communication.getEmployee(1);
        System.out.println(employee);
        System.out.println("");

        Employee employee1 = new Employee("Sveta", "Sokolova", "HR", 900);
        communication.saveEmployee(employee1);
        System.out.println("");

        employee1.setId(8);
        employee1.setSalary(950);
        communication.saveEmployee(employee1);


        communication.deleteEmployee(5);


    }
}