package org.globant.university.data;

import java.util.ArrayList;
import java.util.List;

public class Course {
    public String name;
    public int classroom;
    public String teacherName;

    public List<Student> studentListCourse;

    public Course (String name, int classroom, String teacherName, List studentListCourse) {
        this.name = name;
        this.classroom = classroom;
        this.teacherName = teacherName;
        this.studentListCourse = new ArrayList<>();
    }

    public String getName() { return this.name; }

    public int getClassroom() { return this.classroom; }
    public String teacherName() { return this.teacherName; }








}
