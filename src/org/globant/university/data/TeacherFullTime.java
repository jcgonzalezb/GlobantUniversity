package org.globant.university.data;

public class TeacherFullTime extends Teacher {
    private int yearsExperience;

    public TeacherFullTime(String name, double basicSalary, int yearsExperience) {
        super(name, basicSalary);
        this.yearsExperience = yearsExperience;
    }

    @Override
    public double totalSalary() {
        return (1.1 * yearsExperience * basicSalary);
    }

    public String getName() { return this.name; }


}
