package com.example.entrack.repository;
import com.example.entrack.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
public interface EmployeeRepository
    extends JpaRepository<Employee, Integer>{

    }

