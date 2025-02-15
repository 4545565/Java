package com.nahida.a10oopextendsdemo10;

public class Test {
    public static void main(String[] args) {
        Manager m = new Manager("001", "Tom", 5000, 5000);
        System.out.println(m);
        m.work();
        m.eat();
        Cook c = new Cook();
        c.setId("1243");
        c.setSalary(1234);
        c.setName("Jerry");
        System.out.println(c);
        c.work();
        c.eat();
    }
}