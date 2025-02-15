package com.nahida.studentsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
    private static final String ADD_STUDENT = "1";
    private static final String DELETE_STUDENT = "2";
    private static final String MODIFY_STUDENT = "3";
    private static final String SEARCH_STUDENT = "4";
    private static final String EXIT = "5";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "GBK");
        ArrayList<Student> list = new ArrayList<>();
        String choose;
        loop: while (true) {
            System.out.println("----------欢迎来到学生管理系统----------");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查询学生");
            System.out.println("5.退出系统");
            System.out.println("请输入你的选择：");
            choose = sc.next();
            switch (choose) {
                case ADD_STUDENT -> add(list, sc);
                case DELETE_STUDENT -> delete(list, sc);
                case MODIFY_STUDENT -> modify(list, sc);
                case SEARCH_STUDENT -> search(list, sc);
                case EXIT -> {
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

    public static void add(ArrayList<Student> list, Scanner sc) {
        System.out.println("请输入学生id：");
        String id = sc.next();
        for (Student s : list) {
            if (s.getId().equals(id)) {
                System.out.println("该id已存在");
                return;
            }
        }
        System.out.println("请输入学生姓名：");
        String name = sc.next();
        System.out.println("请输入学生年龄：");
        int age;
        try {
            age = sc.nextInt();
        } catch (Exception e) {
            System.out.println("输入类型有误");
            return;
        }
        System.out.println("请输入学生地址：");
        String address = sc.next();
        list.add(new Student(id, name, age, address));
        System.out.println("添加成功");
    }

    public static void delete(ArrayList<Student> list, Scanner sc) {
        System.out.println("请输入要删除学生的学号：");
        String id = sc.next();
        for (Student s : list) {
            if (s.getId().equals(id)) {
                list.remove(s);
                System.out.println("删除成功");
                return;
            }
        }
        System.out.println("没有找到该学生");
    }

    public static void modify(ArrayList<Student> list, Scanner sc) {
        System.out.println("请输入要修改学生的id");
        String id = sc.next();
        for (Student s : list) {
            if (s.getId().equals(id)) {
                System.out.println("请输入新的学生姓名");
                String name = sc.next();
                System.out.println("请输入新的学生年龄");
                int age;
                try {
                    age = sc.nextInt();
                } catch (Exception e) {
                    System.out.println("输入格式错误");
                    return;
                }
                System.out.println("请输入新的学生地址");
                String address = sc.next();
                s.setId(id);
                s.setName(name);
                s.setAge(age);
                s.setAddress(address);
                return;
            }
        }
        System.out.println("没有找到该学生");
    }

    public static void search(ArrayList<Student> list, Scanner sc) {
        System.out.println("请输入要查询的学生id");
        String id = sc.next();
        for (Student s : list) {
            if (s.getId().equals(id)) {
                System.out.println("Id\t姓名\t年龄\t住址");
                System.out.println(s);
                return;
            }
        }
        System.out.println("没有找到该学生");
    }
}