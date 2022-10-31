package org.globant.university.data;

import java.util.ArrayList;
import java.util.List;

public class University {
    public String name;
    public List<Student> studentList;
    public List<Teacher> teacherList;
    public List<String> teacherStringList;
    public List<String> studentStringList;
    public List<Integer> studentIntList;
    public List<Course> courseList;

    public University(String name) {
        this.name = name;
        this.studentList = new ArrayList<>();
        this.teacherList = new ArrayList<>();
        this.teacherStringList = new ArrayList<>();
        this.studentStringList = new ArrayList<>();
        this.studentIntList = new ArrayList<>();
        this.courseList = new ArrayList<>();
    }

    public String getName() { return this.name; }

    public List<Student> getStudentList() {
        return studentList;
    }

    public int getStudentListAmount(){
        return studentList.size();
    }

    public void insertStudent(Student student){
        this.studentList.add(student);
    }

    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    public int getTeacherAmount() { return teacherList.size(); }

    public void insertTeacher(Teacher teacher) {
        this.teacherList.add(teacher);
    }

    public List<String> getTeacherStringList() {
        return teacherStringList;
    }

    public List<String> getStudentStringList() {
        return studentStringList;
    }

    public List<Integer> getStudentIntList() {
        return studentIntList;
    }

    public List<Course> getCourseList() {
        return courseList;
    }
    public int getCourseListAmount() { return courseList.size(); }
    public void insertCourse(Course course) {
        this.courseList.add(course);
    }



}
