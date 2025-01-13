package com.nahida.test2;

public class GirlFriendTest {
    public static void main(String[] args) {
        GirlFriend gf1 = new GirlFriend();
        gf1.name = "Nahida";
        gf1.age = 500;
        gf1.gender = "female";

        System.out.println(gf1.name);
        System.out.println(gf1.age);
        System.out.println(gf1.gender);

        gf1.eat();
        gf1.sleep();

        GirlFriend gf2 = new GirlFriend();
        gf2.name = "Furina";
        gf2.age = 500;
        gf2.gender = "female";

        System.out.println(gf2.name);
        System.out.println(gf2.age);
        System.out.println(gf2.gender);

        gf2.eat();
        gf2.sleep();
    }
}
