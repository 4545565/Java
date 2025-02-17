package com.nahida.a05innerclassdemo5;

public class Outer {
    public void show() {
        int a = 10;
        class Inner {
            String name;
            int age;

            public void method1() {
                System.out.println("method1");
                System.out.println(a);
            }

            public static void method2() {
                System.out.println("method2");
            }
        }
        Inner i = new Inner();
        System.out.println(i.name);
        System.out.println(i.age);
        i.method1();
        Inner.method2();
    }
}