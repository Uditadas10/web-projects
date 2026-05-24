package com.example.entrack;
import com.example.entrack.service.EmployeeService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.springframework.http.HttpStatus;
import jakarta.validation.Valid;

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
    @ResponseStatus(HttpStatus.CREATED)
    public Employee addEmployee(@Valid @RequestBody Employee employee) {

        return employeeService.addEmployee(employee);
    }
    @GetMapping("/employees/{id}")
    public Employee getEmployeeById(@PathVariable int id) {
        return employeeService.getEmployeeById(id);
    }
    @DeleteMapping("/employees/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteEmployeeById(@PathVariable int id){

        employeeService.deleteEmployee(id);
    }
    @PutMapping("/employees/{id}")
    public Employee updatedEmployee(@PathVariable int id,
                                    @Valid @RequestBody Employee employee) {
       return employeeService.updateEmployee(id, employee);
    }
}