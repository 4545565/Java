package com.nahida.test;

import java.util.Random;

public class LoopTest5 {

    public static void main(String[] args) {
        Random r = new Random();
        int target = r.nextInt(1000000);
        int guessL = 0, guessR = 999999;
        int guessNum;
        int count = 0;
        for (guessNum = (guessL + guessR) >> 1; guessL <= guessR; count++, guessNum = (guessL + guessR) >> 1) {
            if (guessNum == target) {
                System.out.println("恭喜你，猜对了！");
                break;
            } else if (guessNum > target) {
                System.out.println("你猜的数字是：" + guessNum + "，太大了，再小一点吧");
                guessR = guessNum - 1;
            } else {
                System.out.println("你猜的数字是：" + guessNum + "，太小了，再大一点吧");
                guessL = guessNum + 1;
            }
        }
        System.out.println("游戏结束，你一共猜了" + count + "次,答案是" + target);
    }
}
