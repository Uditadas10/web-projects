package com.example.entrack;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
    @Entity
    public class Employee{
        @Id
        private int id;
        private String name;
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
}

