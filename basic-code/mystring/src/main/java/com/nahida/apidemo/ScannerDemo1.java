package com.nahida.apidemo;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a float: ");
        float f = sc.nextFloat();
        System.out.println("You entered: " + f);
    }
}
