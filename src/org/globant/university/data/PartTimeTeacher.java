package org.globant.university.data;

public class PartTimeTeacher extends Teacher {
    private int hoursWeek;

    public PartTimeTeacher(String name, double basicSalary, int hoursWeek) {
        super(name, basicSalary);
        this.hoursWeek = hoursWeek;
    }

    @Override
    public double totalSalary() {
        return (hoursWeek * basicSalary);
    }


    public String getName() { return this.name; }
}
