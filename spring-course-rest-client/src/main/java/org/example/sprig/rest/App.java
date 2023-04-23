package org.example.sprig.rest;

import org.example.sprig.rest.configuration.MyConfig;
import org.example.sprig.rest.entity.Employee;
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

//        List<Employee> allEmployees = communication.getAllEmployees();
//        System.out.println(allEmployees);

//        Employee empById = communication.getEmployee(2);
//        System.out.println(empById);

//        Employee emp = new Employee("Masha", "Sokolova", "IT", 1200);
//        emp.setId(13);
//        communication.saveEmployee(emp);

        communication.deleteEmployee(13);
    }
}
