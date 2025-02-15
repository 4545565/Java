package com.nahida.a01polymorphismdemo1;

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Nahida");
        s.setAge(16);
        Teacher t = new Teacher();
        t.setName("Furina");
        t.setAge(16);
        Administrator a = new Administrator();
        a.setName("Nahida");
        a.setAge(16);
        register(s);
        register(t);
        register(a);
    }

    public static void register(Person p) {
        p.show();
    }
}
