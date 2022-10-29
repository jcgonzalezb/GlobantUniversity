package org.globant.university.data;

public class FullTimeTeacher extends Teacher {
    private int yearsExperience;

    public FullTimeTeacher(String name, double basicSalary, int yearsExperience) {
        super(name, basicSalary);
        this.yearsExperience = yearsExperience;
    }

    @Override
    public double totalSalary() {
        return (1.1 * yearsExperience * basicSalary);
    }

    public String getName() { return this.name; }


}
