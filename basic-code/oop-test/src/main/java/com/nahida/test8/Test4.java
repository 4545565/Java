package com.nahida.test8;

public class Test4 {
    public static void main(String[] args) {
        Student[] arr = new Student[4];
        arr[0] = new Student(1, "Nahida", 500);
        arr[1] = new Student(2, "Furina", 500);
        arr[2] = new Student(3, "Hu Tao", 16);
        addAge(arr, 2);
        for (Student student : arr) {
            if (student == null) {
                break;
            }
            System.out.println(student.getId() + " " + student.getName() + " " + student.getAge());
        }
    }

    public static void addAge(Student[] arr, int id) {
        for (Student student : arr) {
            if (student == null) {
                return;
            } else if (student.getId() == id) {
                student.setAge(student.getAge() + 1);
                return;
            }
        }
        System.out.println("Not found");
    }
}
