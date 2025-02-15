package com.nahida.a03oopextendsdemo3;

import java.io.IOException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {
        Zi z = new Zi();
        // System.out.println(Long.toHexString(VM.current().addressOf(z)));
        Scanner sc = new Scanner(System.in);
        sc.next();
    }
}

class Fu {
    private int a = 0x111;
    int b = 0x222;

    public void fuShow1() {
        System.out.println("fuShow1");
    }

    private void fuShow2() {
        System.out.println("fuShow2");
    }
}

class Zi extends Fu {
    int c = 0x333;

    public void ziShow() {
        System.out.println("ziShow");
    }
}