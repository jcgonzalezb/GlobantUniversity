package org.globant.university.data;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Course {
    public String name;
    public int classroom;
    public String teacherName;

    public ArrayList<Student> studentListCourse;

    public Course (String name, int classroom, String teacherName, ArrayList<Student> studentListCourse) {
        this.name = name;
        this.classroom = classroom;
        this.teacherName = teacherName;
        this.studentListCourse = new ArrayList<>(studentListCourse);
    }

    public String getName() { return this.name; }

    public void insertStudentCourse(Student student){
        this.studentListCourse.add(student);
    }

    public int getStudentListCourseAmount(){
        return studentListCourse.size();
    }

    public List<Student> getStudentListCourse() {
        return studentListCourse;
    }









}
