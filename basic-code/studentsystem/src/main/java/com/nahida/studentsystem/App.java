package com.nahida.studentsystem;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<User> list = new ArrayList<>();
        loop: while (true) {
            System.out.println("欢迎来到学生管理系统！");
            System.out.println("请选择操作：1.登录 2.注册 3.忘记密码 4.退出");
            String choose = sc.next();
            switch (choose) {
                case "1" -> login(list, sc);
                case "2" -> register(list, sc);
                case "3" -> forgetPassword(list, sc);
                case "4" -> {
                    System.out.println("退出系统");
                    try {
                        sc.close();
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    break loop;
                }
                default -> System.out.println("非法输入");
            }
        }
    }

    private static void login(ArrayList<User> list, Scanner sc) {
        String username;
        while (true) {
            System.out.println("请输入用户名：");
            username = sc.next();
            if (!checkUsername(username)) {
                System.out.println("用户名格式错误");
            } else {
                break;
            }
        }
        User u = contains(list, username);
        if (u == null) {
            System.out.println("用户未注册，请先注册");
            return;
        }
        while (true) {
            String verificationCode = getVerificationCode();
            System.out.println("请输入验证码：" + verificationCode);
            if (sc.next().equalsIgnoreCase(verificationCode)) {
                break;
            } else {
                System.out.println("验证码错误");
            }
        }
        for (int i = 2; i > 0; i++) {
            System.out.println("请输入密码：");
            String password = sc.next();
            if (u.getPassword().equals(password)) {
                System.out.println("登录成功");
                break;
            } else if (i > 0) {
                System.out.printf("密码错误，还有%d次机会\n", i - 1);
            } else {
                System.out.println("登录失败");
            }
        }
    };

    private static void register(ArrayList<User> list, Scanner sc) {
        String username, password1, password2, personID, phoneNumber;
        while (true) {
            System.out.println("请输入用户名：");
            username = sc.next();
            if (!checkUsername(username)) {
                continue;
            }
            if (contains(list, username) != null) {
                System.out.println("用户名已存在");
                continue;
            }
            break;
        }
        while (true) {
            System.out.println("请输入密码：");
            password1 = sc.next();
            System.out.println("请再次输入密码：");
            password2 = sc.next();
            if (!password1.equals(password2)) {
                System.out.println("两次密码不一致");
            } else {
                System.out.println("两次密码一致");
                break;
            }
        }
        while (true) {
            System.out.println("请输入身份证号：");
            personID = sc.next();
            if (checkPersonID(personID)) {
                System.out.println("身份证号格式正确");
                break;
            }
        }
        while (true) {
            System.out.println("请输入手机号：");
            phoneNumber = sc.next();
            if (checkPhoneNumber(phoneNumber)) {
                System.out.println("手机号格式正确");
                break;
            } else {
                System.out.println("手机号格式错误");
            }
        }
        list.add(new User(username, password1, personID, phoneNumber));
        System.out.println("注册成功");
    }

    private static void forgetPassword(ArrayList<User> list, Scanner sc) {
        String username, personID, password1, password2;
        while (true) {
            System.out.println("请输入用户名：");
            username = sc.next();
            if (!checkUsername(username)) {
                System.out.println("用户名格式错误");
            } else {
                break;
            }
        }
        User u = contains(list, username);
        if (u == null) {
            System.out.println("用户未注册，请先注册");
            return;
        }
        while (true) {
            System.out.println("请输入身份证号：");
            personID = sc.next();
            if (checkPersonID(personID)) {
                break;
            }
        }
        if (!u.getPersonID().equals(personID)) {
            System.out.println("账号信息不匹配，验证失败");
            return;
        }
        while (true) {
            System.out.println("验证成功，请输入新密码：");
            password1 = sc.next();
            System.out.println("请再次输入新密码：");
            password2 = sc.next();
            if (!password1.equals(password2)) {
                System.out.println("两次密码不一致");
            } else {
                System.out.println("修改密码成功");
                u.setPassword(password1);
                break;
            }
        }
    }

    private static User contains(ArrayList<User> list, String username) {
        for (User u : list) {
            if (u.getUsername().equals(username)) {
                return u;
            }
        }
        return null;
    }

    private static boolean checkUsername(String username) {
        if (username.length() < 3 || username.length() > 15) {
            System.out.println("用户名长度必须在3-15之间");
            return false;
        }
        boolean allNum = true;
        for (char c : username.toCharArray()) {
            if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
                allNum = false;
            } else if (!(c >= '0' && c <= '9')) {
                System.out.println("用户名只能包含字母和数字");
                return false;
            }
        }
        if (allNum) {
            System.out.println("用户名不能全部为数字");
            return false;
        } else {
            return true;
        }
    }

    private static boolean checkPersonID(String personID) {
        if (personID.length() != 18) {
            System.out.println("身份证号长度必须为18位");
            return false;
        }
        if (personID.startsWith("0")) {
            System.out.println("身份证号不能以0开头");
            return false;
        }
        for (char c : personID.substring(0, 17).toCharArray()) {
            if (!(c >= '0' && c <= '9')) {
                System.out.println("身份证号格式错误");
                return false;
            }
        }
        if (!((personID.charAt(17) >= '0' && personID.charAt(17) <= '9')
                || (personID.charAt(17) == 'X' && personID.charAt(17) == 'x'))) {
            System.out.println("身份证号格式错误");
            return false;
        }
        return true;
    }

    private static boolean checkPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() != 11) {
            return false;
        }
        if (!phoneNumber.startsWith("1")) {
            return false;
        }
        for (char c : phoneNumber.toCharArray()) {
            if (!(c >= '0' && c <= '9')) {
                return false;
            }
        }
        return true;
    }

    private static String getVerificationCode() {
        char[] arr = new char[5];
        Random r = new Random();
        for (int i = 0; i < 5; i++) {
            arr[i] = (char) ('A' + r.nextInt(26) + 32 * r.nextInt(1));
        }
        arr[r.nextInt(5)] = (char) (r.nextInt(10) + '0');
        return new String(arr);
    }
}