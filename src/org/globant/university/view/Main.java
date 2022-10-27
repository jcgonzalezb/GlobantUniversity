package org.globant.university.view;

import org.globant.university.data.*;
import org.globant.university.persistance.DataInitializer;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        University GlobantUniversity = DataInitializer.loadUniversity();
        System.out.println("Welcome to " + GlobantUniversity.getName() + "\n");
        DataInitializer.loadStudentsIntoUni(GlobantUniversity);
        printStudentList(GlobantUniversity);
        DataInitializer.loadFullTimeTeachersIntoUni(GlobantUniversity);
        DataInitializer.loadPartTimeTeachersIntoUni(GlobantUniversity);
        printTeacherList(GlobantUniversity);

    }

    public static void printStudentList(University GlobantUniversity) {
        if (GlobantUniversity.getStudentListAmount() == 0) {
            System.out.println("No students registered on the university.\n");
        } else {
            List<Student> students = GlobantUniversity.getStudentList();
            System.out.println("List of students: ");
            for(int i =0; i < GlobantUniversity.getStudentListAmount(); i++) {
                Student currentStudent = students.get(i);
                System.out.println(currentStudent.getName());
                //System.out.println(currentStudent.getId());
                }
            System.out.println("\n");
        }
    }

    public static void TeacherListComplete(University GlobantUniversity) {
        List<String> teachers = GlobantUniversity.getTeacherCompleteList();
        List<TeacherFullTime> teacherFullTime = GlobantUniversity.getTeacherFullTimeList();
        List<TeacherPartTime> teacherPartTime = GlobantUniversity.getTeacherPartTimeList();
        for(int i =0; i < GlobantUniversity.getTeacherFullTimeAmount(); i++) {
            TeacherFullTime currentTeacher = teacherFullTime.get(i);
            teachers.add(currentTeacher.getName());
        }
        for(int i =0; i < GlobantUniversity.getTeacherPartTimeAmount(); i++) {
            TeacherPartTime currentTeacher = teacherPartTime.get(i);
            teachers.add(currentTeacher.getName());
        }
    }


    public static void printTeacherList(University GlobantUniversity) {
        TeacherListComplete(GlobantUniversity);
        List<String> teachers = GlobantUniversity.getTeacherCompleteList();
        if (GlobantUniversity.getTeacherCompleteListAmount() == 0) {
            System.out.println("No teachers registered on the university.\n");
        } else {
            System.out.println("List of teachers: ");
            for(int i =0; i < GlobantUniversity.getTeacherCompleteListAmount(); i++) {
                String currentStudent = teachers.get(i);
                System.out.println(currentStudent);
            }
            System.out.println("\n");
        }
    }

    public static void printCourseList(University GlobantUniversity) {
        if (GlobantUniversity.getCourseListAmount() == 0) {
            System.out.println("No courses registered on the university.\n");
        } else {
            List<Course> courses = GlobantUniversity.getCourseList();
            System.out.println("List of courses: ");
            for(int i =0; i < GlobantUniversity.getStudentListAmount(); i++) {
                Course currentCourse = courses.get(i);
                System.out.println(currentCourse.getName());
            }
            System.out.println("\n");
        }
    }




}