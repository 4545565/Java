package com.nahida.method;

import java.util.Random;

public class Test8 {

    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[r.nextInt(30) + 1];
        System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100);
            System.out.printf("%d ", arr[i]);
        }
        System.out.println();
        int from = r.nextInt(arr.length);
        int to = from + r.nextInt(arr.length - from);
        System.out.println(from + "\t" + to);
        int[] newArr = copyOfRange(arr, from, to);
        for (int i = 0; i < newArr.length; i++) {
            System.out.printf("%d ", newArr[i]);
        }
        System.out.println();
    }

    public static int[] copyOfRange(int[] arr, int from, int to) {
        int[] newArr = new int[to - from];
        for (int i = from; i < to; i++) {
            newArr[i - from] = arr[i];
        }
        return newArr;
    }
}
