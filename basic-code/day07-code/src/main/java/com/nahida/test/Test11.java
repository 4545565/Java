package com.nahida.test;

import java.util.Random;
import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
        int[] arr = createNumber().clone();
        int[] userInputArr = userInputNumber().clone();
        int redCount = 0;
        int blueCount = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < userInputArr.length; j++) {
                if (arr[i] == userInputArr[j]) {
                    redCount++;
                    break;
                }
            }
        }
        if (arr[arr.length - 1] == userInputArr[userInputArr.length - 1]) {
            blueCount++;
        }
        int bonus = switch (redCount + blueCount) {
            case 7 ->
                10000000;
            case 6 ->
                blueCount == 0 ? 5000000 : 3000;
            case 5 ->
                200;
            case 4 ->
                10;
            default ->
                blueCount == 1 ? 5 : 0;
        };
        System.out.println(bonus);
    }

    public static int[] userInputNumber() {
        int[] arr = new int[7];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6;) {
            System.out.println("请输入第" + (i + 1) + "个红球号码:");
            int redNumber = sc.nextInt();
            if (redNumber >= 1 && redNumber <= 33) {
                if (!contains(arr, redNumber)) {
                    arr[i] = redNumber;
                    i++;
                } else {
                    System.out.println("当前红球号码已经存在,请重新输入");
                }
            } else {
                System.out.println("当前红球号码超出范围");
            }
        }
        System.out.println("请输入蓝球号码:");
        int blueNumber = sc.nextInt();
        while (true) {
            if (blueNumber >= 1 && blueNumber <= 16) {
                arr[arr.length - 1] = blueNumber;
                break;
            } else {
                System.out.println("当前蓝球号码超出范围");
            }
        }
        sc.close();
        return arr;
    }

    public static int[] createNumber() {
        int[] arr = new int[7];
        Random r = new Random();
        for (int i = 0; i < 6;) {
            int redNumber = r.nextInt(33) + 1;
            if (!contains(arr, redNumber)) {
                arr[i] = redNumber;
                i++;
            }
        }
        int blueNumber = r.nextInt(16) + 1;
        arr[arr.length - 1] = blueNumber;
        return arr;
    }

    public static boolean contains(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return true;
            }
        }
        return false;
    }
}