package com.nahida.test;

public class Test5 {
    public static void main(String[] args) {
        String num1 = "123456789";
        String num2 = "12345";
        String result = "";
        int[] n1 = new int[num1.length()];
        int[] n2 = new int[num2.length()];
        int[] r = new int[num1.length() + num2.length() - 1];
        for (int i = 0; i < num1.length(); i++) {
            n1[i] = num1.charAt(num1.length() - i - 1) - '0';
        }
        for (int i = 0; i < num2.length(); i++) {
            n2[i] = num2.charAt(num2.length() - i - 1) - '0';
        }
        for (int i = 0; i < num1.length(); i++) {
            for (int j = 0; j < num2.length(); j++) {
                r[i + j] += n1[i] * n2[j];
            }
        }
        for (int i = 0; i < r.length - 1; i++) {
            r[i + 1] += r[i] / 10;
            r[i] %= 10;
        }
        for (int i = r.length - 1; i >= 0; i--) {
            result += r[i];
        }
        System.out.println(result);
    }
}
