package com.nahida.a06innerclassdemo6;

public class Test2 {
    public static void main(String[] args) {
        Swim s = new Swim() {
            @Override
            public void swim() {
                System.out.println("自由泳");
            }
        };
        s.swim();
        new Swim() {
            @Override
            public void swim() {
                System.out.println("蛙泳");
            }
        }.swim();
    }
}