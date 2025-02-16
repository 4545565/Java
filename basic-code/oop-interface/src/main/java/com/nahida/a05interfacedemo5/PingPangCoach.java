package com.nahida.a05interfacedemo5;

public class PingPangCoach extends Coach implements English {
    public PingPangCoach() {
    }

    public PingPangCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("PingPangCoach teach PingPang");
    }

    @Override
    public void speakEnglish() {
        System.out.println("PingPangCoach speak English");
    }
}