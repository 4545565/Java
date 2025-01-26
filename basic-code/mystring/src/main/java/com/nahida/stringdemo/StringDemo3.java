package com.nahida.stringdemo;

import java.util.Scanner;

public class StringDemo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s1 = sc.next();
        String s2 = "abc";
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}
