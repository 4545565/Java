package com.nahida.test;

public class Test4 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append("abcdefghijklmnopqrstuvwxyz0123456789");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
    }
}