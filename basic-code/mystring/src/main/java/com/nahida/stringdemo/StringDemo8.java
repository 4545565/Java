package com.nahida.stringdemo;

public class StringDemo8 {
    public static void main(String[] args) {
        String str = "abcdefg";
        String result = reserve(str);
        System.out.println(result);
    }

    public static String reserve(String str) {
        if (str == null) {
            return "";
        } else if (str.length() == 0) {
            return "";
        } else {
            String result = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                result += str.charAt(i);
            }
            return result;
        }
    }
}
