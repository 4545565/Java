package com.nahida.test;

import java.util.ArrayList;

public class Test7 {

    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        User u1 = new User("001", "Nahida", "123");
        User u2 = new User("002", "Furina", "456");
        User u3 = new User("003", "Hu Tao", "789");
        list.add(u1);
        list.add(u2);
        list.add(u3);
        System.out.println(findIndex(list, "002"));
    }

    public static int findIndex(ArrayList<User> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }
}