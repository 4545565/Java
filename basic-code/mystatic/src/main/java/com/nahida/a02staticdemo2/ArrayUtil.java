package com.nahida.a02staticdemo2;

import java.util.StringJoiner;

public class ArrayUtil {
    private ArrayUtil() {
    }

    public static String printArr(int[] arr) {
        StringJoiner sj = new StringJoiner(", ", "[", "]");
        for (int i : arr) {
            sj.add(String.valueOf(i));
        }
        return sj.toString();
    }

    public static double getAverage(double[] arr) {
        double sum = 0;
        for (double i : arr) {
            sum += i;
        }
        return sum / arr.length;
    }
}
