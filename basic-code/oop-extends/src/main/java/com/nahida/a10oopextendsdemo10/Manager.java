package com.nahida.a10oopextendsdemo10;

import java.util.StringJoiner;
public class Manager extends Employee {
    private double bonus;

    public Manager() {
    }

    public Manager(String id, String name, double salary, double bonus) {
        super(id, name, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return this.bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    @Override
    public void work() {
        System.out.println("Manager is working");
    }
    @Override
    public String toString() {
        StringJoiner sj = new StringJoiner("\t");
        sj.add(super.toString()).add(String.valueOf(this.bonus));
        return sj.toString();
    }
}