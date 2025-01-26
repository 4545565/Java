package com.nahida.stringdemo;

import java.util.Scanner;

public class StringDemo6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        int bigCount = 0, smallCount = 0, numberCount = 0, otherCount = 0;
        for (char ch : str.toCharArray()) {
            if (ch >= 'A' && ch <= 'Z') {
                bigCount++;
            } else if (ch >= 'a' && ch <= 'z') {
                smallCount++;
            } else if (ch >= '0' && ch <= '9') {
                numberCount++;
            } else {
                otherCount++;
            }
        }
        System.out.printf("Number of uppercase letters: %d\n", bigCount);
        System.out.printf("Number of lowercase letters: %d\n", smallCount);
        System.out.printf("Number of digits: %d\n", numberCount);
        System.out.printf("Number of other characters: %d\n", otherCount);
    }
}
