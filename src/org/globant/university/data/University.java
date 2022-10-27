package org.globant.university.data;

import java.util.ArrayList;
import java.util.List;

public class University {
    public String name;

    public List<Student> studentList;

    public List<TeacherFullTime> teacherFullTimeList;
    public List<TeacherPartTime> teacherPartTimeList;
    public List<String> teacherCompleteList;
    public List<Course> courseList;

    public University(String name) {
        this.name = name;
        this.studentList = new ArrayList<>();
        this.teacherFullTimeList = new ArrayList<>();
        this.teacherPartTimeList = new ArrayList<>();
        this.teacherCompleteList = new ArrayList<>();
        this.courseList = new ArrayList<>();
    }

    public String getName() { return this.name; }

    public List<Student> getStudentList() {
        return studentList;
    }

    public int getStudentAmount(){
        return studentList.size();
    }

    public void insertStudent(Student student){
        this.studentList.add(student);
    }

    public List<TeacherFullTime> getTeacherFullTimeList() {
        return teacherFullTimeList;
    }

    public int getTeacherFullTimeAmount() { return teacherFullTimeList.size(); }

    public void insertTeacherFullTime(TeacherFullTime teacherFullTime) {
        this.teacherFullTimeList.add(teacherFullTime);
    }
    public List<TeacherPartTime> getTeacherPartTimeList() {
        return teacherPartTimeList;
    }
    public int getTeacherPartTimeAmount() { return teacherPartTimeList.size(); }

    public void insertTeacherPartTime(TeacherPartTime teacherPartTime) {
        this.teacherPartTimeList.add(teacherPartTime);
    }

    public List<String> getTeacherCompleteList() {
        return teacherCompleteList;
    }

    public int getTeacherCompleteListAmount() { return teacherCompleteList.size(); }

    public void insertTeacherComplete(String teacher) {
        this.teacherCompleteList.add(teacher);
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void insertCourse(Course course) {
        this.courseList.add(course);
    }

}
