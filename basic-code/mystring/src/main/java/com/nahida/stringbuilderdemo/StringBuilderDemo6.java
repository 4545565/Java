package com.nahida.stringbuilderdemo;

import java.util.Scanner;

public class StringBuilderDemo6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.next();
        String result = new StringBuilder(s).reverse().toString();
        System.out.println(s.equals(result) ? "Yes" : "No");
        sc.close();
    }
}
