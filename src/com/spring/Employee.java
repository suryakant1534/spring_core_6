package com.spring;

public class Employee {
    static {
        System.out.println("Class Loading.");
    }

    private static Employee getInstance() {
        System.out.println("Business Logic implement.");
        return new Employee();
    }
}
