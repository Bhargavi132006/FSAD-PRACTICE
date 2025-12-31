package com.klu.model;

import javax.persistence.*;

@Entity
@Table(name = "emp")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int empid;

    private String empName;
    private double empSalary;

    @ManyToOne
    @JoinColumn(name = "deptid")
    private Department department;

    // Default constructor
    public Employee() {}

    // Getters and Setters
    public int getEmpId() {
        return empid;
    }

    public void setEmpName(String empName) {
        this.empName = empName; // ✅ fixed
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}