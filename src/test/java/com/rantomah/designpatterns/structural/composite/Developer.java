package com.rantomah.designpatterns.structural.composite;

import java.util.List;

public class Developer implements Employee {

    private float salary;
    private final String name;
    private List<String> roles;

    public Developer(String name, float salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public float getSalary() {
        return this.salary;
    }

    @Override
    public List<String> getRoles() {
        return this.roles;
    }
}
