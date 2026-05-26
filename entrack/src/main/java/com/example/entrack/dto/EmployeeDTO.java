package com.example.entrack.dto;

import jakarta.validation.constraints.NotBlank;
public class EmployeeDTO {
    @NotBlank(message = "Name cannot be empty")
    private String name;

    @NotBlank(message = "Department cannot be empty")
    private String depertment;

    public EmployeeDTO() {
    }

    public EmployeeDTO(String name, String depertment) {
        this.name = name;
        this.depertment = depertment;
    }

    public String getName() {
        return name;
    }

    public String getDepertment() {
        return depertment;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepertment(String depertment) {
        this.depertment = depertment;
    }
}
