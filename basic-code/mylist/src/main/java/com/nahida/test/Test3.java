package com.nahida.test;

import java.util.ArrayList;

public class Test3 {
    public static void main(String[] args) {
        ArrayList<Character> list = new ArrayList<>();
        for (char c = 'a'; c <= 'g'; c++) {
            list.add(c);
        }
        System.out.println(list);
    }
}