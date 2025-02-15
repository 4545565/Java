package com.nahida.a04polymorphismdemo4;

import java.util.StringJoiner;
public class Animal {
    private int age;
    private String color;

    public Animal() {
    }

    public Animal(int age, String color) {
        this.age = age;
        this.color = color;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void eat(String something) {
        System.out.println("吃" + something);
    }
    @Override
    public String toString() {
        StringJoiner sj = new StringJoiner("\t");
        sj.add(String.valueOf(this.age)).add(this.color);
        return sj.toString();
    }
}
