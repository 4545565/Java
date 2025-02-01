package com.nahida.stringbuilderdemo;

import java.util.Scanner;

public class StringBuilderDemo5 {
    public static void main(String[] args) {
        int len = getString().substring(1).replace("A", "Q").length();
        System.out.println(len);
    }

    public static String getString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.next();
        sc.close();
        return s;
    }
}
