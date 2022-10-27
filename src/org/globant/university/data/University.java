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


    public void insertTeacherFullTime(TeacherFullTime teacherFullTime){
        this.teacherList.add(teacherFullTime);
    }

    public void insertTeacherPartTime(TeacherPartTime teacherPartTime){
        this.teacherList.add(teacherPartTime);
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void insertCourse(Course course) {
        this.courseList.add(course);
    }

}
