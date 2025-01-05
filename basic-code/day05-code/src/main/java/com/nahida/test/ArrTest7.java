package com.nahida.test;

public class ArrTest7 {

    public static void main(String[] args) {
        int[] arr1 = {11, 22};
        int[] arr2 = arr1;
        System.out.println(arr1[0]);
        System.out.println(arr2[0]);
        arr2[0] = 99;
        System.out.println(arr1[0]);
        System.out.println(arr2[0]);
    }
}
