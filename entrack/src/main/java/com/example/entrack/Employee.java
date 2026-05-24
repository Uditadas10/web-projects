package com.example.entrack;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
    @Entity
    public class Employee{
        @Id
        @Positive(message = "Id must be positive")
        private int id;
        @NotBlank(message = "Name cannot be empty")
        private String name;
        @NotBlank(message = "Department cannot be empty")
        private String depertment;

        public Employee() {

        }

    public Employee(int id, String name, String depertment) {
        this.id=id;
        this.name=name;
        this.depertment=depertment;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepertment() {
        return depertment;
    }

        public void setId(int id) {
            this.id = id;
        }
        public void setName(String name) {
            this.name = name;
        }

        public void setDepertment(String depertment) {
            this.depertment = depertment;
        }
}

