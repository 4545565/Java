package com.nahida.a06innerclassdemo6;

public class Test {
    public static void main(String[] args) {
        new Swim() {
            @Override
            public void swim() {
                System.out.println("自由泳");
            }
        };
        new Animal() {
            @Override
            public void eat() {
                System.out.println("自由吃");
            }
        };
        Dog d = new Dog();
        method(d);
        method(new Animal() {
            @Override
            public void eat() {
                System.out.println("Dog is eating");
            }
        });
    }

    public static void method(Animal a) {
        a.eat();
    }
}