package com.nahida.a09oopextendsdemo9;

public class Student {
    String name;
    int age;
    String school;

    public Student() {
        this(null, 0, "Nahida");
    }

    public Student(String name, int age, String school) {
        this.name = name;
        this.age = age;
        this.school = school;
    }

    public void show() {
        System.out.println("name=" + name + ",age=" + age + ",school=" + school);
    }
}