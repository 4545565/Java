package com.nahida.test8;

public class Test {
    public static void main(String[] args) {
        Student[] arr = new Student[0];
        Student s1 = new Student(1, "Nahida", 500);
        Student s2 = new Student(2, "Furina", 500);
        Student s3 = new Student(3, "Hu Tao", 16);
        Student s4 = new Student(4, "Kamisato Ayaka", 18);
        arr = addToArr(arr, s1);
        arr = addToArr(arr, s2);
        arr = addToArr(arr, s3);
        arr = addToArr(arr, s4);
        for (Student student : arr) {
            System.out.println(student.getId() + " " + student.getName() + " " + student.getAge());
        }
    }

    public static boolean contains(Student[] arr, Student s) {
        for (Student student : arr) {
            if (student != null) {
                if (student.getId() == s.getId()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int getCount(Student[] arr) {
        int l = 0, r = arr.length - 1, m;
        while (l <= r) {
            m = (l + r) / 2;
            if (arr[m] == null) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    public static Student[] addToArr(Student[] arr, Student s) {
        if (contains(arr, s)) {
            return arr;
        } else {
            if (getCount(arr) < arr.length) {
                arr[getCount(arr)] = s;
                return arr;
            } else {
                Student[] newArr = new Student[arr.length + 1];
                System.arraycopy(arr, 0, newArr, 0, arr.length);
                newArr[arr.length] = s;
                return newArr;
            }
        }
    }
}
