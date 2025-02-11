package com.nahida.test;

import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        String str = "abcdefg";
        for (int i = 0; i < 10; i++) {
            str= shuffle(str);
        }
        System.out.println(str);
    }

    public static String shuffle(String str) {
        char[] arr = str.toCharArray();
        Random r = new Random();
        int n = arr.length;
        int i = r.nextInt(n);
        int j = (i + r.nextInt(1, n)) % n;
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        String result = new String(arr);
        return result;
    }
}