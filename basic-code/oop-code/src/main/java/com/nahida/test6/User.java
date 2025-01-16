package com.nahida.test6;

public class User {
    private String name;
    private String password;
    private String email;
    private String gengder;
    private int age;

    public User() {
    }

    public User(String name, String password, String email, String gengder, int age) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.gengder = gengder;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return this.gengder;
    }

    public void setGender(String gengder) {
        this.gengder = gengder;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}