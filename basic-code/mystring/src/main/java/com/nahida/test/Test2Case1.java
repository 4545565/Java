package com.nahida.test;

public class Test2Case1 {
    public static void main(String[] args) {
        String strA = "abcde";
        String strB = "cdeab";
        System.out.println(isRotation(strA, strB));
    }

    public static String rotate(String str) {
        return str.substring(1) + str.substring(0, 1);
    }

    public static boolean isRotation(String strA, String strB) {
        if (strA.length() != strB.length()) {
            return false;
        }
        String str = new String(strA);
        for (int i = 0; i < strA.length(); i++) {
            str = rotate(str);
            if (str.equals(strB)) {
                return true;
            }
        }
        return false;
    }
}