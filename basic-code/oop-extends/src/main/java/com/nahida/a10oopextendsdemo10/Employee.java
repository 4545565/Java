package com.nahida.a10oopextendsdemo10;

import java.util.StringJoiner;

public class Employee {
    private String id;
    private String name;
    private double salary;

    public Employee() {
    }

    public Employee(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void work() {
        System.out.println("Employee is working...");
    }

    public void eat() {
        System.out.println("Employee is eating...");
    }
    @Override
    public String toString() {
        StringJoiner sj = new StringJoiner("\t");
        sj.add(this.id).add(this.name).add(String.valueOf(this.salary));
        return sj.toString();
    }
}
