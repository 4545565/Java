package com.nahida.listdemo;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);
        list.add(new String());
        list.add("李四");
        list.add("王五");
        list.set(0, "1234");
        System.out.println(list);
    }
}