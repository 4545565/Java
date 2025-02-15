package com.nahida.test1;

public class Test {
    public static void main(String[] args) {
        final int a = 10;
        System.out.println(Math.PI);
    }
}

class Fu {
    public final void show() {
        System.out.println("Fu");
    }
}

class Zi extends Fu {
}