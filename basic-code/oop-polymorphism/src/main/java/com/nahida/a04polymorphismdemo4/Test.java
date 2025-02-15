package com.nahida.a04polymorphismdemo4;

public class Test {
    public static void main(String[] args) {
        Person p1 = new Person("张三", 20);
        Person p2 = new Person("李四", 21);
        Dog d = new Dog(4, "black");
        Cat c = new Cat(3, "white");
        p1.feedPet(d, "bone");
        p2.feedPet(c, "fish");
    }
}
