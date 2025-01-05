package com.nahida.test;

import java.util.Random;

public class ArrTest6 {

    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = {1, 2, 3, 4, 5};
        int i, j;
        int temp;
        for (i = 0; i < arr.length; i++) {
            j = r.nextInt(arr.length);
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for (i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
