package org.example.spring.rest.controller;

import org.example.spring.rest.entity.Employee;
import org.example.spring.rest.exception_handing.EmployeeIncorrectData;
import org.example.spring.rest.exception_handing.NoSuchEmployeeExcaption;
import org.example.spring.rest.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRESTController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    private List<Employee> showAllEmployees() {
        System.out.println("showAllEmployees");
        List<Employee> allEmployees = employeeService.getAllEmployees();
        return allEmployees;
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable int id) {
        Employee employee = employeeService.getEmployee(id);

        if(employee==null) {
            throw new NoSuchEmployeeExcaption("There is no employee with ID = " + id + " in Database");
        }
        return employee;
    }

    @PostMapping("/employees")
    public Employee addNewEmployee(@RequestBody Employee employee) {
        System.out.println("addNewEmployee");
        employeeService.saveEmployee(employee);
        return employee;
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee) {
        System.out.println("updateEmployee");
        employeeService.saveEmployee(employee);
        return employee;
    }

    @DeleteMapping("/employees/{id}")
    public String deleteEmployee(@PathVariable int id) {

        Employee employee = employeeService.getEmployee(id);
        if(employee==null) {
            throw new NoSuchEmployeeExcaption("There is no employee with ID = " + id + " in Database");
        }
        employeeService.deleteEmployee(id);
        return "Employee with ID = " + id + " was deleted!";
    }
}
