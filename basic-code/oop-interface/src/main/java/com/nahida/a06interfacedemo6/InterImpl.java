package com.nahida.a06interfacedemo6;

public class InterImpl implements InterA, InterB {
    @Override
    public void method() {
        System.out.println("实现接口中的方法");
    }

    @Override
    public void show() {
        System.out.println("实现接口中的默认方法");
    }
}