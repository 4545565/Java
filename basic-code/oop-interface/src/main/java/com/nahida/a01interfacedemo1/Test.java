package com.nahida.a01interfacedemo1;

public class Test {
    public static void main(String[] args) {
        Frog f = new Frog(null, 0);
        System.out.println(f);
        f.eat();
        f.swim();
        Rabbit r = new Rabbit(null, 0);
        System.out.println(r);
        r.eat();
        Dog d = new Dog();
        System.out.println(d);
        d.eat();
        d.swim();
    }
}
