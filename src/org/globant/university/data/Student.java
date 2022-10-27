package org.globant.university.data;

public class Student {
    public String name;
    private final int id;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.id = (int)(100000 * Math.random());
        this.age = age;
    }

    public String getName() { return this.name; }
    public int getId() { return this.id; }
    public int getAge() { return this.age; }

}
