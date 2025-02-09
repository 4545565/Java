package com.nahida.test;

import java.util.Scanner;

public class Test1Case2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        while (true) {
            System.out.println("Enter a string:");
            str = sc.next();
            if (checkStr(str)) {
                break;
            } else {
                System.out.println("Invalid number");
            }
        }
        System.out.println(changeLuoMa(str));
    }

    public static boolean checkStr(String str) {
        if (str.length() > 9) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }

    public static String changeLuoMa(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            int n = str.charAt(i) - '0';
            String s = switch (n) {
                case 0 -> " ";
                case 1 -> "I";
                case 2 -> "II";
                case 3 -> "III";
                case 4 -> "IV";
                case 5 -> "V";
                case 6 -> "VI";
                case 7 -> "VII";
                case 8 -> "VIII";
                case 9 -> "IX";
                default -> "";
            };
            sb.append(s);
        }
        return sb.toString();
    }
}