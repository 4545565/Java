package com.nahida.arraydemo;

import java.util.Random;

public class ArrTest3 {

    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100);
            if (arr[i] >> 1 << 1 == arr[i]) {
                System.out.println(arr[i] + "\t" + (arr[i] >> 1));
            } else {
                System.out.println(arr[i] + "\t" + (arr[i] << 1));
            }
        }
    }
}
