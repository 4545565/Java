package com.nahida.stringdemo;

public class StringDemo7 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        String str = arrToString(arr);
        System.out.println(str);
    }

    public static String arrToString(int[] arr) {
        if (arr == null) {
            return "";
        } else if (arr.length == 0) {
            return "[]";
        } else {
            String result = "[";
            for (int i = 0; i < arr.length; i++) {
                result += arr[i] + ", ";
            }
            result = result.substring(0, result.length() - 2) + "]";
            return result;
        }
    }
}
