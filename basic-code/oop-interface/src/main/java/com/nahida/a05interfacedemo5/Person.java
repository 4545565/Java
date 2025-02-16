package com.nahida.a05interfacedemo5;

import java.util.StringJoiner;

public abstract class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
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