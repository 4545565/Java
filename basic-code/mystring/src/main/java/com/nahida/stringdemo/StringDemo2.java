package com.nahida.stringdemo;

public class StringDemo2 {
    public static void main(String[] args) {
        String s1 = new String("abc");
        String s2 = "ABC";
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
    }
}
