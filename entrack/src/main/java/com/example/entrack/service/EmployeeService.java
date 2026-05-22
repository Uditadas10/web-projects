package com.example.entrack.service;

import com.example.entrack.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service

public class EmployeeService {
    public List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<>();

            employees.add(new Employee(1, "John", "IT"));
            employees.add(new Employee(2, "Udita", "IT"));
            employees.add(new Employee(3, "Rahul", "IT"));

            return employees;

    }
}

