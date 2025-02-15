package com.nahida.a04oopextendsdemo4;

public class Test {
    public static void main(String[] args) {
        Zi z = new Zi();
        z.zishow();
    }
}

class Fu {
    String name = "fu";
}

class Zi extends Fu {
    String name = "zi";

    public void zishow() {
        String name = "zishow";
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
}