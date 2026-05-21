package com.example.entrack;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Welcome";
    }

    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "John", "IT"));

        employees.add(new Employee(2, "Udita", "IT"));
        employees.add(new Employee(3, "Rahul", "IT"));
        return employees;
    }
}