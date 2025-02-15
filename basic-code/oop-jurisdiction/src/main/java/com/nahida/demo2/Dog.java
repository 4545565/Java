package com.nahida.demo2;

import com.nahida.demo1.Animal;

public class Dog extends Animal {
    @Override
    public void show() {
        System.out.println(name);
    }
}