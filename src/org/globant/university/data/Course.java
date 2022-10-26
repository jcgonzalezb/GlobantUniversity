package org.globant.university.data;

import java.util.ArrayList;
import java.util.List;

public class Course {
    public String name;
    public int classroom;
    public String teacherName;

    public List<Student> studentListCourse;

    private Course (String name, int classroom, String teacherName) {
        this.name = name;
        this.classroom = classroom;
        this.teacherName = teacherName;

    }




}
