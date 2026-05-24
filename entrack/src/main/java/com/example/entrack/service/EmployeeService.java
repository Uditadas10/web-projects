package com.example.entrack.service;

import com.example.entrack.Employee;
import com.example.entrack.repository.EmployeeRepository;
import org.springframework.stereotype.Service;
import com.example.entrack.exception.ResourceNotException;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }

    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee getEmployeeById(int id) {
        return employeeRepository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotException("Employee not found"));
    }

    public void deleteEmployee(int id) {
        employeeRepository.deleteById(id);
    }

    public Employee updateEmployee(int id, Employee updatedEmployee) {

        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotException("Employee not found"));

        employee.setName(updatedEmployee.getName());
        employee.setDepertment(updatedEmployee.getDepertment());

        return employeeRepository.save(employee);
    }
}