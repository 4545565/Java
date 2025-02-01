package com.nahida.stringbuilderdemo;

public class StringBuilderDemo3 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append(1);
        sb.append(2.3);
        sb.append(true);
        sb.reverse();
        System.out.println(sb.length());
        System.out.println(sb);
    }
}
