package org.globant.university.data;

import java.lang.reflect.Array;
import java.time.temporal.TemporalAdjuster;
import java.util.ArrayList;
import java.util.List;

public class Course {
    public String name;
    private final int id;
    public int classroom;
    public Teacher teacher;
    public List<Student> studentListCourse;
    public List<Integer> studentListCourseInt;

    public Course (String name, int classroom, Teacher teacher, ArrayList<Student> studentListCourse) {
        this.name = name;
        this.id = (int)(1000 * Math.random());
        this.classroom = classroom;
        this.teacher = teacher;
        this.studentListCourse = new ArrayList<>(studentListCourse);
        this.studentListCourseInt = new ArrayList<>();

    }

    public String getName() { return this.name; }
    public int getId() { return this.id; }

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
    public List<Integer> getStudentListCourseInt() {return studentListCourseInt; }

}
