package org.globant.university.data;

import java.util.ArrayList;
import java.util.List;

public class University {
    public String name;

    public List<Student> studentList;
    public List<Teacher> teacherList;
    public List<Course> courseList;

    public University(String name) {
        this.name = name;
        this.studentList = new ArrayList<>();
        this.teacherList = new ArrayList<>();
        this.courseList = new ArrayList<>();
    }

}
