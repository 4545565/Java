package com.nahida.test;

import java.util.Random;

public class Test4 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(generateRandomString());
        }
    }

    public static String generateRandomString() {
        char[] arr = new char[62];
        for (int i = 0; i < 26; i++) {
            arr[i] = (char) ('A' + i);
            arr[i + 26] = (char) ('a' + i);
        }
        for (int i = 0; i < 10; i++) {
            arr[52 + i] = (char) ('0' + i);
        }
        String str = new String();
        Random r = new Random();
        boolean flag = true;
        int index;
        for (int i = 0; i < 5; i++) {
            if (flag) {
                index = r.nextInt(62);
                str += arr[index];
                if (index >= 52) {
                    flag = false;
                }
            } else {
                index = r.nextInt(52);
                str += arr[index];
            }
        }
        return str;
    }
}