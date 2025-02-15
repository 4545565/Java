package com.nahida.a02abstractdemo2;

public class Test {
    public static void main(String[] args) {
        Frog f = new Frog("小青蛙", 1);
        f.eat();
        Dog d = new Dog("小狗", 2);
        d.eat();
        Sheep s = new Sheep("小羊", 3);
        s.eat();
    }
}
