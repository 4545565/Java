package com.nahida.a01oopextendsdemo1;

public class Test {
    public static void main(String[] args) {
        Ragdoll rd = new Ragdoll();
        rd.eat();
        rd.drink();
        rd.catchMouse();
        Husky h = new Husky();
        h.eat();
        h.drink();
        h.lookHome();
        h.breakHome();
    }
}
