package com.nahida.codeblockdemo1;

import java.util.StringJoiner;

public class Student {
    private String name;
    private int age;
    {
        System.out.println("student class");
    }

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        StringJoiner sj = new StringJoiner("\t");
        sj.add(this.name).add(String.valueOf(this.age));
        return sj.toString();
    }
}