package com.nahida.a01polymorphismdemo1;

public class Student extends Person {
    @Override
    public void show() {
        System.out.println("学生信息为"+this.getName()+","+this.getAge());
    }
}
