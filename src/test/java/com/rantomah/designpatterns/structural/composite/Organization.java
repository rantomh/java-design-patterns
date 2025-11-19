package com.rantomah.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Organization {

    private List<Employee> employees;

    public void addEmployee(Employee employee) {
        if (employees == null) {
            employees = new ArrayList<>();
        }
        employees.add(employee);
    }

    public float getNetSalaries() {
        float netSalary = 0f;
        if (employees != null) {
            for (Employee employee : employees) {
                netSalary += employee.getSalary();
            }
        }
        return netSalary;
    }
}
