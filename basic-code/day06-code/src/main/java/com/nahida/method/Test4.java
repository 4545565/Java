package com.nahida.method;

public class Test4 {

    public static void main(String[] args) {
        byte a = 1, b = 1;
        int c = 1, d = 1;
        long e = 1, f = 1;
        compare(a, b);
        compare(c, d);
        compare(e, f);
    }

    public static void compare(double a, double b) {
        System.out.println(a == b);
    }
}
