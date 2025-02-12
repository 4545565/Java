package com.nahida.a04staticdemo4;

public class StudentTest {
    public static void main(String[] args) {
        Student.teacherName = "Nahida";
        Student s1 = new Student();
        s1.name = "Furina";
        s1.age = 18;
        s1.show1();
        Student s2 = new Student();
        s2.name = "Nahida";
        s2.age = 18;
        s2.show1();
    }
}