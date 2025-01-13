package com.nahida.test1;

public class PhoneTest {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.brand = "xiaomi";
        p.price = 1999;
        System.out.println(p.brand);
        System.out.println(p.price);
        p.call();
        p.playGame();

        Phone p2 = new Phone();
        p2.brand = "apple";
        p2.price = 9999;
        System.out.println(p2.brand);
        System.out.println(p2.price);
        p2.call();
        p2.playGame();
    }
}
