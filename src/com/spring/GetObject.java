package com.spring;

public class GetObject {
    public Student getStudent() {
        System.out.println("Get Object is calling.");
        return new Student();
    }
}
