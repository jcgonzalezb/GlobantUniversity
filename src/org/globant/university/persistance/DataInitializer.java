package org.globant.university.persistance;

import org.globant.university.data.*;

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
    public static void loadCoursesIntoUni(University GlobantUniversity) {
        Course course1  = new Course("Logistics", 101, "York Roessler");
        GlobantUniversity.insertCourse(course1);
    }





}
