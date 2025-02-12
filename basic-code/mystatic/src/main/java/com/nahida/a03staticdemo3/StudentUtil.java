package com.nahida.a03staticdemo3;

import java.util.ArrayList;

public class StudentUtil {
    private StudentUtil() {
    }

    public static int getMaxAgeStudent(ArrayList<Student> list) {
        int max = 0;
        for (Student s : list) {
            if (s.getAge() > max) {
                max = s.getAge();
            }
        }
        return max;
    }
    
}
