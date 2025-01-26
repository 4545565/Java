package com.nahida.stringdemo;

import java.util.Scanner;

public class StringDemo4 {
    public static void main(String[] args) {
        String rightUsername = "zhangsan";
        String rightPassword = "123456";
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter username:");
            String username = sc.next();
            System.out.println("Enter password:");
            String password = sc.next();
            if (rightUsername.equals(username) && rightPassword.equals(password)) {
                System.out.println("Login successful!");
                break;
            } else {
                System.out.println("Login failed!");
                if (i == 2) {
                    System.out.println("Login disabled!");
                } else {
                    System.out.printf("You have %d more chance(s).\n", 2 - i);
                }
            }
        }
    }
}
