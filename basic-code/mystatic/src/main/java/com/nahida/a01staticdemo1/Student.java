package com.nahida.a01staticdemo1;

import java.util.StringJoiner;

public class Student {
    private String name;
    private int age;
    private String gender;
    private static String teacherName = "Nahida";

    public Student() {
    }

    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void study() {
        System.out.println(name + " study");
    }

    public void show() {
        System.out.println("name:" + name + "\tage:" + age + "\tgender:" + gender + "\tTeacher:" + teacherName);
    }

    @Override
    public String toString() {
        StringJoiner sj = new StringJoiner("\t");
        sj.add(this.name).add(String.valueOf(this.age)).add(this.gender);
        return sj.toString();
    }
}