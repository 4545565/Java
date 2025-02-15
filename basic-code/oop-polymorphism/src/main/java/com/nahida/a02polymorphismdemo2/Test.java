package com.nahida.a02polymorphismdemo2;

public class Test {
    public static void main(String[] args) {
        Animal a = new Dog();
        System.out.println(a.name);
        a.show();
    }
}

class Animal {
    String name = "Animal";

    public void show() {
        System.out.println("Animal show");
    }
}

class Dog extends Animal {
    String name = "Dog";

    @Override
    public void show() {
        System.out.println("Dog show");
    }
}

class Cat extends Animal {
    String name = "Cat";

    @Override
    public void show() {
        System.out.println("Cat show");
    }
}