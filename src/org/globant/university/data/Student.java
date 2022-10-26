package org.globant.university.data;

public class Student {
    public String name;
    private final int id;
    private int age;

    public Student(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }
}
