package com.nahida.stringdemo;

public class StringDemo11 {
    public static void main(String[] args) {
        String id = "123456123456781234";
        String year = id.substring(6, 10);
        String month = id.substring(10, 12);
        String day = id.substring(12, 14);
        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
        String gender = id.charAt(16) % 2 == 1 ? "男" : "女";
        System.out.println("Gender: " + gender);
    }
}
