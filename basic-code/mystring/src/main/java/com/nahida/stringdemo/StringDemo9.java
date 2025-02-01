package com.nahida.stringdemo;

import java.util.Scanner;

public class StringDemo9 {
    static String[] arr = { "零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖" };
    static String[] unit = { "元", "拾", "佰", "仟", "万", "拾", "佰" };

    public static void main(String[] args) {
        System.out.println(getCapitaalNumber(getMoney()));
    }

    public static int getMoney() {
        Scanner sc = new Scanner(System.in);
        int money;
        while (true) {
            System.out.println("Enter a money amount: ");
            money = sc.nextInt();
            if (money >= 0 && money <= 9999999) {
                break;
            } else {
                System.out.println("Invalid amount");
            }
        }
        sc.close();
        return money;
    }

    public static String getCapitaalNumber(int money) {
        String result = "";
        for (int i = 0; i < 7; i++) {
            int digit = money % 10;
            money = money / 10;
            result = arr[digit] + unit[i] + result;
        }
        return result;
    }
}
