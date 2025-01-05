package com.nahida.twodimentionarr;

public class TwoDimentionDemo2 {
    public static void main(String[] args) {
        int[][] arr = new int[2][];
        arr[0] = new int[] { 11, 22 };
        arr[1] = new int[] { 44, 55, 66 };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
