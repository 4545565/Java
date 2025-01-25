package com.nahida.test8;

public class Test3 {
    public static void main(String[] args) {
        Student[] arr = new Student[3];
        arr[0] = new Student(1, "Nahida", 500);
        arr[1] = new Student(2, "Furina", 500);
        arr[2] = new Student(3, "Hu Tao", 16);
        arr = removeFromArr(arr, 2);
        for (Student student : arr) {
            if (student == null) {
                break;
            }
            System.out.println(student.getId() + " " + student.getName() + " " + student.getAge());
        }
    }

    // public static int getIndex(Student[] arr, int id) {
    // for (int i = 0; i < arr.length; i++) {
    // if (arr[i] == null) {
    // return -1;
    // } else if (arr[i].getId() == id) {
    // return i;
    // }
    // }
    // return -1;
    // }

    public static Student[] removeFromArr(Student[] arr, int id) {
        // int index = getIndex(arr, id);
        // if (index == -1) {
        // System.out.println("Not found");
        // return arr;
        // } else {
        // Student[] newArr = new Student[arr.length];
        // for (int i = 0, j = 0; i < arr.length; i++) {
        // if (i != index) {
        // newArr[j++] = arr[i];
        // }
        // }
        // return newArr;
        // }
        Student[] newArr = new Student[arr.length];
        int i = 0;
        for (Student s : arr) {
            if (s.getId() != id) {
                newArr[i++] = s;
            }
        }
        if (i == arr.length) {
            System.out.println("Not found");
        }
        return newArr;
    }
}
