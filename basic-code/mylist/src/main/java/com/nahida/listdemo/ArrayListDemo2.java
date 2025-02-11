package com.nahida.listdemo;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        System.out.println(list);
        System.out.println(list.remove(1));
        System.out.println(list);
        System.out.println(list.remove("ccc"));
        System.out.println(list);
        System.out.println(list.remove("eee"));
        System.out.println(list);
        list.set(1, "asdf");
        System.out.println(list);
        System.out.println(list.get(1));
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}