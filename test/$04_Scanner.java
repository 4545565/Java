package test;

import java.util.Scanner;

public class $04_Scanner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println(i);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a + b);
        try {
            sc.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
