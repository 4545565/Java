package com.nahida.test;

public class Test2Case2 {
    public static void main(String[] args) {
        String strA = "abcde";
        String strB = "cdeab";
        System.out.println(isRotation(strA, strB));
    }

    public static boolean isRotation(String strA, String strB) {
        if (strA == null || strB == null) {
            return false;
        } else if (strA.length() != strB.length()) {
            return false;
        } else if (strA.length() == 0) {
            return true;
        } else {
            char[] arrA = strA.toCharArray();
            char[] arrB = strB.toCharArray();
            int n = arrA.length;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (arrA[j] != arrB[(i + j) % n]) {
                        break;
                    } else if (j == n - 1) {
                        return true;
                    }
                }
            }
            return false;
        }
    }
}