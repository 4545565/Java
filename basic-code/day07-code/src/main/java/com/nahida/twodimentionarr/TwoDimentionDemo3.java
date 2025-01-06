package com.nahida.twodimentionarr;

public class TwoDimentionDemo3 {
    public static void main(String[] args) {
        int[][] arr = new int[4][];
        arr[0] = new int[] { 22, 66, 44 };
        arr[1] = new int[] { 77, 33, 88 };
        arr[2] = new int[] { 25, 45, 65 };
        arr[3] = new int[] { 11, 66, 99 };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += getSum(arr[i]);
        }
        // System.out.println("sum=" + sum);
        System.out.println(sum);
    }

    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
