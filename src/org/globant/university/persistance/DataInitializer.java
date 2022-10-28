package org.globant.university.persistance;

import org.globant.university.data.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class DataInitializer {
    public static University loadUniversity() {
        University GlobantUniversity = new University("Globant University");
        return GlobantUniversity;
    }

    public static void loadStudentsIntoUni(University GlobantUniversity) {
        Student student1 = new Student("Juan Gonzalez", 17);
        Student student2 = new Student("Diego Gonzalez", 21);
        Student student3 = new Student("Maria Bautista", 20);
        Student student4 = new Student("Jose Gonzalez", 23);
        Student student5 = new Student("Ana Buvinghausen", 24);
        Student student6 = new Student("Ken Buvinghausen", 25);
        GlobantUniversity.insertStudent(student1);
        GlobantUniversity.insertStudent(student2);
        GlobantUniversity.insertStudent(student3);
        GlobantUniversity.insertStudent(student4);
        GlobantUniversity.insertStudent(student5);
        GlobantUniversity.insertStudent(student6);
    }

    public static void loadFullTimeTeachersIntoUni(University GlobantUniversity) {
        TeacherFullTime teacherFullTime1 = new TeacherFullTime("York Roessler", 400, 4);
        TeacherFullTime teacherFullTime2 = new TeacherFullTime("Priyanto Kusuma", 400, 5 );
        GlobantUniversity.insertTeacherFullTime(teacherFullTime1);
        GlobantUniversity.insertTeacherFullTime(teacherFullTime2);
    }

    public static void loadPartTimeTeachersIntoUni(University GlobantUniversity) {
        TeacherPartTime teacherPartTime1 = new TeacherPartTime("Marcus Theller", 200, 20);
        TeacherPartTime teacherPartTime2 = new TeacherPartTime("Marco Azuero", 200, 30);
        GlobantUniversity.insertTeacherPartTime(teacherPartTime1);
        GlobantUniversity.insertTeacherPartTime(teacherPartTime2);
    }

    //public static void loadStudentsIntoCourse(Course Logistics) {
      //  Student student1 = new Student("Juan Gonzalez", 17);
        //Logistics.insertStudentCourse(student1);
    //}


    public static void loadCoursesIntoUni(University GlobantUniversity) {
        ArrayList<Student> studentCourseList1 = new ArrayList<>();
        ArrayList<Student> studentCourseList2 = new ArrayList<>();
        ArrayList<Student> studentCourseList3 = new ArrayList<>();
        ArrayList<Student> studentCourseList4 = new ArrayList<>();
        Course scrum  = new Course("Scrum", 101, "York Roessler", studentCourseList1 );
        Course wireline  = new Course("Wireline", 102, "Priyanto Kusuma", studentCourseList2 );
        Course logistics  = new Course("Logistics", 102, "Marcus Theller", studentCourseList3 );
        Course business  = new Course("Business", 102, "Marco Azuero", studentCourseList4 );
        Student student1 = new Student("Juan Gonzalez", 17);
        Student student2 = new Student("Diego Gonzalez", 21);
        Student student3 = new Student("Maria Bautista", 20);
        Student student4 = new Student("Jose Gonzalez", 23);
        Student student5 = new Student("Ana Buvinghausen", 24);
        Student student6 = new Student("Ken Buvinghausen", 25);
        scrum.insertStudentCourse(student1);
        scrum.insertStudentCourse(student2);
        GlobantUniversity.insertCourse(scrum);
        wireline.insertStudentCourse(student3);
        wireline.insertStudentCourse(student4);
        GlobantUniversity.insertCourse(wireline);
        logistics.insertStudentCourse(student5);
        GlobantUniversity.insertCourse(logistics);
        business.insertStudentCourse(student6);
        GlobantUniversity.insertCourse(business);
    }

    public static void printCourseTest(Course course) {
        System.out.println(course.getTeacherName());
    }




}
