package com.nahida.test2;

public class Test {
    public static void main(String[] args) {
        final double PI = 3.14;
        final Student s = new Student();
        s.setAge(20);
        s.setName("Nahida");
        System.out.println(s);
        final int[] arr = { 1, 2, 3, 4, 5 };
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= arr[i];
            System.out.println(arr[i]);
        }
    }
}
