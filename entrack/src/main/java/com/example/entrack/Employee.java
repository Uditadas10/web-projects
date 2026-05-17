package com.example.entrack;

public class Employee {
    private int id;
    private String name;
    private String depertment;

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
