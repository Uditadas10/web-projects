package com.example.entrack.service;

import com.example.entrack.Employee;
import com.example.entrack.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service

public class EmployeeService {
    private final EmployeeRepository employeeRepository;
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;

    }
    public List<Employee>  getEmployees(){
        return employeeRepository.findAll();
    }
    public Employee addEmployee(Employee employee){
        return employeeRepository.save(employee);
    }
    public Employee getEmployeeById(int id){
        Optional<Employee> employee= employeeRepository.findById(id);
        return employee.orElse(null);
    }
    public void deleteEmployee(int id){
        employeeRepository.deleteById(id);
    }
}


