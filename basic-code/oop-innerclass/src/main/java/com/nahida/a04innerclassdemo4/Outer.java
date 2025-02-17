package com.nahida.a04innerclassdemo4;

public class Outer {

    static class Inner {
        int a = 10;
        static int b = 20;

        public void show1() {
            System.out.println("show1");
            System.out.println(a);
            System.out.println(b);
        }

        public static void show2() {
            System.out.println("show2");
            System.out.println(b);
        }
    }
}