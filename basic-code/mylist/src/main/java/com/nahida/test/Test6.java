package com.nahida.test;

import java.util.ArrayList;

public class Test6 {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        User u1 = new User("001", "Nahida", "123");
        User u2 = new User("002", "Furina", "456");
        User u3 = new User("003", "Hu Tao", "789");
        list.add(u1);
        list.add(u2);
        list.add(u3);
        if (contains(list, "002")) {
            System.out.println("存在");
        } else {
            System.out.println("不存在");
        }
    }

    public static boolean contains(ArrayList<User> list, String id) {
        for (User u : list) {
            if (u == null) {
                continue;
            }
            if (u.getId() == null) {
                continue;
            }
            if (u.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }
}
