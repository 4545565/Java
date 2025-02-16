package com.nahida.a05interfacedemo5;

public class PingPangSporter extends Sporter implements English {
    public PingPangSporter() {
    }

    public PingPangSporter(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("study Pingpang");
    }

    @Override
    public void speakEnglish() {
        System.out.println("speaking English");
    }
}