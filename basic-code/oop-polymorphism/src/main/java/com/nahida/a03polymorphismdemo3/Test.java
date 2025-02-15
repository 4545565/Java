package com.nahida.a03polymorphismdemo3;

public class Test {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.eat();
        if (a instanceof Dog d) {
            d.lookHome();
        } else if (a instanceof Cat c) {
            c.catchMouse();
        } else {
            System.out.println("Animal eat");
        }
    }
}

class Animal {
    public void eat() {
        System.out.println("Animal eat");
    }
}

class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("Dog eat");
    }

    public void lookHome() {
        System.out.println("Dog lookHome");
    }
}

class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("Cat eat");
    }

    public void catchMouse() {
        System.out.println("Cat catchMouse");
    }
}