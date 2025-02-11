package com.nahida.test;

import java.util.ArrayList;
import java.util.StringJoiner;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("赵六");
        StringJoiner sj = new StringJoiner(", ", "[", "]");
        for (String s : list) {
            sj.add(s);
        }
        System.out.println(sj);
    }
}