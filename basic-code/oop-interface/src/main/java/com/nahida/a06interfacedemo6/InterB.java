package com.nahida.a06interfacedemo6;

public interface InterB {
    public default void show() {
        System.out.println("InterB.show()");
    }
}