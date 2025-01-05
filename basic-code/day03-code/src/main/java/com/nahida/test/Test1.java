package com.nahida.test;

import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("请输入一个三位数:");
        int number = sc.nextInt();
        int ge = number % 10, shi = number / 10 % 10, bai = number / 100 % 10;
        System.out.println(ge);
        System.out.println(shi);
        System.out.println(bai);
        try {
            sc.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
