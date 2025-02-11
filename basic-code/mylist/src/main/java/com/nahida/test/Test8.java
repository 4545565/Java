package com.nahida.test;

import java.util.ArrayList;

public class Test8 {
    public static void main(String[] args) {
        ArrayList<Phone> list = new ArrayList<>();
        Phone p1 = new Phone("华为", 5999);
        Phone p2 = new Phone("小米", 1999);
        Phone p3 = new Phone("三星", 3999);
        list.add(p1);
        list.add(p2);
        list.add(p3);
        ArrayList<Phone> newList = getPhoneInfo(list);
        for (Phone p : newList) {
            System.out.println(p.getBrand() + ":" + p.getPrice());
        }
    }

    public static ArrayList<Phone> getPhoneInfo(ArrayList<Phone> list) {
        ArrayList<Phone> newList = new ArrayList<>();
        for (Phone p : list) {
            if (p.getPrice() < 3000) {
                newList.add(p);
            }
        }
        return newList;
    }
}