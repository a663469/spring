package org.example.spring.mvc_hibernate_aop.dao;

import org.example.spring.mvc_hibernate_aop.entity.Employee;
import org.hibernate.Session;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void deleteEmployee(int id);
}
