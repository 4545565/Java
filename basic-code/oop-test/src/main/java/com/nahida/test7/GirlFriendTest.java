package com.nahida.test7;

public class GirlFriendTest {
    public static void main(String[] args) {
        GirlFriend[] arr = new GirlFriend[4];
        arr[0] = new GirlFriend("小红", 18, "女", "打游戏");
        arr[1] = new GirlFriend("小花", 19, "女", "看电影");
        arr[2] = new GirlFriend("小丽", 20, "女", "逛街");
        arr[3] = new GirlFriend("小美", 21, "女", "吃饭");
        int sumAge = 0;
        for (GirlFriend g : arr) {
            sumAge += g.getAge();
        }
        System.out.println("年龄总和为：" + sumAge);
        double avgAge = sumAge * 1.0 / arr.length;
        System.out.println("平均年龄为：" + avgAge);
        int count = 0;
        for (GirlFriend g : arr) {
            if (g.getAge() < avgAge) {
                count++;
                System.out.println(g.getName() + "的年龄小于平均年龄");
            }
        }
        System.out.println("年龄小于平均年龄的女友个数为：" + count);
    }
}
