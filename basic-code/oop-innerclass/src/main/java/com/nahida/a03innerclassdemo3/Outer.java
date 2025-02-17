package com.nahida.a03innerclassdemo3;

public class Outer {
    private int a = 10;

    public class Inner {
        private int a = 20;
        public void show() {
            int a = 30;
            System.out.println(a);
            System.out.println(this.a);
            System.out.println(Outer.this.a);
        }
    }
}