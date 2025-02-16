package com.nahida.a01innerclassdemo1;

public class Car {
    String carName;
    int carAge;
    String carColor;

    public void show() {
        System.out.println(carName);
        Engine e = new Engine();
        e.show();
    }

    private class Engine {
        String engineName;
        int engineAge;

        public void show() {
            System.out.println(engineName);
            System.out.println(carName);
        }
    }
}