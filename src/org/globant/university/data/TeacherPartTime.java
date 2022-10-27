package org.globant.university.data;

public class TeacherPartTime extends Teacher {
    private int hoursWeek;

    public TeacherPartTime(String name, double basicSalary, int hoursWeek) {
        super(name, basicSalary);
        this.hoursWeek = hoursWeek;
    }

    @Override
    public double totalSalary() {
        return (hoursWeek * basicSalary);
    }


    public String getName() { return this.name; }
}
