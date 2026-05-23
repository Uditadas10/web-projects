package com.example.entrack;
import com.example.entrack.service.EmployeeService;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
public class HelloController {

    private final EmployeeService employeeService;

    public HelloController(EmployeeService employeeService) {

        this.employeeService = employeeService;
    }

    @GetMapping("/")
    public String home() {
        return "Welcome";
    }

    @GetMapping("/employees")
    public List<Employee> getEmployees() {
    return employeeService.getEmployees();

    }
    @PostMapping("/employees")
    public String addEmployee(@RequestBody Employee employee) {
        employeeService.addEmployee(employee);

        return "employee added successfuly";
    }
    @GetMapping("/employees/{id}")
    public Employee getEmployeeById(@PathVariable int id) {
        return employeeService.getEmployeeById(id);
    }
    @DeleteMapping("/employees/{id}")
    public String deleteEmployeeById(@PathVariable int id){
       employeeService.deleteEmployee(id);

            return "employee deleted successfuly";

    }

}