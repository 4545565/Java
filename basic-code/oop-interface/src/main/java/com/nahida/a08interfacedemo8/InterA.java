package com.nahida.a08interfacedemo8;

public interface InterA {
    public default void show1() {
        System.out.println("InterA.show1");
        show3();
        show4();
    }

    public default void show2() {
        System.out.println("InterA.show2");
        show3();
        show4();
    }

    private void show3() {
        System.out.println("InterA.show3");
    }
    private static void show4() {
        System.out.println("InterA.show4");
    }
}