package com.nahida.a04polymorphismdemo4;

import java.util.StringJoiner;

public class Person {
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

    // public void feedPet(Dog d, String something) {
    // System.out.println("主人" + this.name + "喂狗吃" + something);
    // d.eat(something);
    // }

    // public void feedPet(Cat c, String something) {
    // System.out.println("主人" + this.name + "喂猫吃" + something);
    // c.eat(something);
    // }
    public void feedPet(Animal a, String something) {
        if (a instanceof Dog d) {
            System.out.println("主人" + this.name + "喂狗吃" + something);
            d.eat(something);
        } else if (a instanceof Cat c) {
            System.out.println("主人" + this.name + "喂猫吃" + something);
            c.eat(something);
        } else {
            System.out.println("主人" + this.name + "喂动物吃" + something);
            a.eat(something);
        }
    }

    @Override
    public String toString() {
        StringJoiner sj = new StringJoiner("\t");
        sj.add(this.name).add(String.valueOf(this.age));
        return sj.toString();
    }
}
