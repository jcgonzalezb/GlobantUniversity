package org.globant.university.data;

public abstract class Teacher {
    public String name;
    public double basicSalary;

    public Teacher(String name, double basicSalary) {
        this.name = name;
        this.basicSalary = basicSalary;
        }

    public abstract double totalSalary();

    public String getName() { return this.name; }
    }



