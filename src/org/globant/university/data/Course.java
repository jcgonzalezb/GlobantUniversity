package org.globant.university.data;

import java.lang.reflect.Array;
import java.time.temporal.TemporalAdjuster;
import java.util.ArrayList;
import java.util.List;

public class Course {
    public String name;
    public int classroom;
    public Teacher teacher;

    public ArrayList<Student> studentListCourse;

    public Course (String name, int classroom, Teacher teacher, ArrayList<Student> studentListCourse) {
        this.name = name;
        this.classroom = classroom;
        this.teacher = teacher;
        this.studentListCourse = new ArrayList<>(studentListCourse);
    }

    public String getName() { return this.name; }

    public Integer getClassroom() { return this.classroom; }

    public String getTeacherName() { return this.teacher.name; }

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
