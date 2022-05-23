package com.romanderevyago.spring.rest;

import com.romanderevyago.spring.rest.configuration.MyConfig;
import com.romanderevyago.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = context.getBean("communication", Communication.class);
       List<Employee> allEmployee =  communication.getAllEmployees();

        System.out.println(allEmployee);

    }
}
