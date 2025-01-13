package com.nahida.test2;

public class GirlFriendTest {
    public static void main(String[] args) {
        GirlFriend gf1 = new GirlFriend();
        gf1.setName("Nahida");
        gf1.setAge(500);
        gf1.setGender("female");

        System.out.println(gf1.getName());
        System.out.println(gf1.getAge());
        System.out.println(gf1.getGender());

        gf1.eat();
        gf1.sleep();

        GirlFriend gf2 = new GirlFriend();
        gf2.setName("Furina");
        gf2.setAge(500);
        gf2.setGender("female");

        System.out.println(gf2.getName());
        System.out.println(gf2.getAge());
        System.out.println(gf2.getGender());

        gf2.eat();
        gf2.sleep();
    }
}
