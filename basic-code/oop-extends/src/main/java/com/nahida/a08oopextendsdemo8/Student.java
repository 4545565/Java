package com.nahida.a08oopextendsdemo8;

public class Student extends Person {
    public Student() {
        super();
        System.out.println("Student()");
    }
    public Student(String name, int age) {
        super(name, age);
        System.out.println("Student(String name, int age)");
    }
}
