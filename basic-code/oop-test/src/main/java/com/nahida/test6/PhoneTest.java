package com.nahida.test6;

public class PhoneTest {
    public static void main(String[] args) {
        Phone[] arr = new Phone[3];
        arr[0] = new Phone("华为", 3999, "黑色");
        arr[1] = new Phone("苹果", 5999, "白色");
        arr[2] = new Phone("小米", 2999, "蓝色");
        int sum = 0;
        for (Phone p : arr) {
            sum += p.getPrice();
        }
        System.out.println("总价：" + sum);
        double avg = sum * 1.0 / arr.length;
        System.out.println("平均价：" + avg);
    }
}
