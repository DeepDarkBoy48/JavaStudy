package com.hspedu.homeworkX.homework10X;

public class homework10X {
    public static void main(String[] args) {
        Doctor doctor1 = new Doctor("robin1", 20, "c", 'm', 20000);
        Doctor doctor2 = new Doctor("robin", 20, "c", 'm', 20000);
        System.out.println(doctor1.equals(doctor2));
    }
}
