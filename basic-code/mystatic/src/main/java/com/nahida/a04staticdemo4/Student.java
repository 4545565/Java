package com.nahida.a04staticdemo4;

public class Student {
    String name;
    int age;
    static String teacherName;

    public void show1() {
        System.out.println(name + "," + age + "," + teacherName);
    }

    public static void method() {
        System.out.println("static method");
    }
}
