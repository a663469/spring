package org.example.spring.rest.dao;

import org.example.spring.rest.entity.Employee;
import org.hibernate.Session;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void deleteEmployee(int id);
}
