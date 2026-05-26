package com.example.entrack;

import com.example.entrack.dto.EmployeeDTO;
import com.example.entrack.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.Operation;
import java.util.List;
@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/welcome")
    public String home() {
        return "Welcome";
    }

    @Operation(summary = "Get all employees")
    @GetMapping
    public List<Employee> getEmployees() {
        return employeeService.getEmployees();
    }

    @Operation(summary = "Get employee by id")
    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable int id) {
        return employeeService.getEmployeeById(id);
    }

    @Operation(summary = "Delete employee by id")
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteEmployeeById(@PathVariable int id) {
        employeeService.deleteEmployee(id);
    }

    @Operation(summary = "Update employee")
    @PutMapping("/{id}")
    public Employee updatedEmployee(
            @PathVariable int id,
            @Valid @RequestBody EmployeeDTO employeeDTO) {

        Employee employee = new Employee();

        employee.setName(employeeDTO.getName());
        employee.setDepertment(employeeDTO.getDepertment());

        return employeeService.updateEmployee(id, employee);
    }

    @Operation(summary = "Add new employee")
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Employee addEmployee(
            @Valid @RequestBody EmployeeDTO employeeDTO) {

        Employee employee = new Employee();

        employee.setName(employeeDTO.getName());
        employee.setDepertment(employeeDTO.getDepertment());

        return employeeService.addEmployee(employee);
    }
}
