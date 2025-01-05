package com.nahida.test;

import java.util.Random;

public class Test7 {

    public static void main(String[] args) {
        Random r = new Random();
        int num1 = r.nextInt(100000);
        System.out.println(num1);
        int num2 = encryptNumber(num1);
        System.out.println(num2);
    }

    public static int encryptNumber(int originalNumber) {
        int encryptedNumber = 0;
        while (originalNumber > 0) {
            encryptedNumber *= 10;
            encryptedNumber += (originalNumber + 5) % 10;
            originalNumber /= 10;
        }
        return encryptedNumber;
    }
}
