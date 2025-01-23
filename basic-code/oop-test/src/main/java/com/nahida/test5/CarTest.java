package com.nahida.test5;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        Car[] arr = new Car[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Car();
        }
        Scanner sc = new Scanner(System.in);
        for (Car c : arr) {
            System.out.println("Enter brand: ");
            c.setBrand(sc.next());
            System.out.println("Enter price: ");
            c.setPrice(sc.nextInt());
            System.out.println("Enter color: ");
            c.setColor(sc.next());
        }
        for (Car c : arr) {
            System.out.println(c.getBrand() + "\t" + c.getPrice() + "\t" + c.getColor());
        }
    }
}
