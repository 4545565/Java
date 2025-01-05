package com.nahida.test;

import java.util.Scanner;

public class Test4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("请输入一个三位数:");
        int num = sc.nextInt();
        System.out.println("个位:" + num % 10);
        System.out.println("十位:" + num / 10 % 10);
        System.out.println("百位:" + num / 100 % 10);
        try {
            sc.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
