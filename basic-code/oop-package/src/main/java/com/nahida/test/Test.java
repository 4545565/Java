package com.nahida.test;

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("张三");
        s.setAge(18);
        System.out.println(s);
        com.nahida.domain1.Teacher t1 = new com.nahida.domain1.Teacher();
        com.nahida.domain2.Teacher t2 = new com.nahida.domain2.Teacher();
    }
}