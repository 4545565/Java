package com.nahida.method;

import java.util.Scanner;

public class Method3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.println("请输入第一个整数:");
        num1 = sc.nextInt();
        System.out.println("请输入第二个数:");
        num2 = sc.nextInt();
        System.out.println("两个数的和为:" + getSum(num1, num2));
        try {
            sc.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static int getSum(int a, int b) {
        return a + b;
    }
}