package com.example.entrack.service;

import com.example.entrack.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service

public class EmployeeService {
    public List<Employee> employees  = new ArrayList<>();
        public EmployeeService() {
            employees.add(new Employee(1, "John", "IT"));
            employees.add(new Employee(2, "Udita", "IT"));
            employees.add(new Employee(3, "Rahul", "IT"));

    }
    public List<Employee> getEmployees(){
        return employees;
    }
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
    public Employee getEmployeeById(int id) {
        for(Employee employee : employees){
            if(employee.getId()==id){
                return employee;
            }
        }
        return null;
    }
    public boolean deleteEmployee(int id){
            for (Employee employee: employees){
                if(employee.getId()==id){
                    employees.remove(employee);

                    return true;
                }
            }
            return false;
    }
}


