package com.spring;

public class Student {
    static {
        System.out.println("Class Loading..");
    }

    Student() {
        System.out.println("Student Object method is initialized.");
    }
}
