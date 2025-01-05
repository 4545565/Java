package com.nahida.test;

import java.util.Random;

public class Test3 {

    public static void main(String[] args) {
        Random r = new Random();
        String str = "";
        for (int i = 0; i < 4; i++) {
            str += randomLetter();
        }
        str += r.nextInt(10);
        System.out.println(str);
    }

    public static char randomLetter() {
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        Random r = new Random();
        return str.charAt(r.nextInt(52));
    }
}
