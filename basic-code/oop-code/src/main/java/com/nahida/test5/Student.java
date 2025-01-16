package com.nahida.test5;

public class Student {
    private String name;
    private int age;

    public Student() {
        System.out.println("Student()");
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Student(name:%s, age:%d)".formatted(name, age));
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
}
