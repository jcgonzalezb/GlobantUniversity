package org.globant.university.view;

import org.globant.university.data.*;
import org.globant.university.persistance.DataInitializer;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        University GlobantUniversity = DataInitializer.loadUniversity();
        System.out.println("Welcome to " + GlobantUniversity.getName() + "\n");
        DataInitializer.loadStudentsIntoUni(GlobantUniversity);
        printStudentList(GlobantUniversity);
        DataInitializer.loadFullTimeTeachersIntoUni(GlobantUniversity);
        DataInitializer.loadPartTimeTeachersIntoUni(GlobantUniversity);
        printTeacherList(GlobantUniversity);
        DataInitializer.loadCoursesIntoUni(GlobantUniversity);
        printCourseList(GlobantUniversity);
        displayInitialMenu(GlobantUniversity);
        // DataInitializer.printStudentListCourse();

    }

    public static void displayInitialMenu(University GlobantUniversity) {
        Scanner scan = new Scanner(System.in);
        boolean exit = false;
        do {
            System.out.println("Welcome to the Globant University menu\n");
            System.out.println("Select you option: ");
            System.out.println("1.  Print all the professors with its data");
            System.out.println("2.  Print all the classes");
            System.out.println("3.  Create a new student and add it to an existing class");
            System.out.println("4.  Create a new class and add an existing teacher, existing students and its relevant data");
            System.out.println("5.  List all the classes in which a given student is included");
            System.out.println("6.  Exit");
            int option = scan.nextInt();
            scan = new Scanner(System.in);
            switch (option) {
                case 1:
                    System.out.println("Work in progress 1");
                    break;
                case 2:
                    System.out.println("Work in progress 2");
                    break;
                case 3:
                    System.out.println("Work in progress 3");
                    break;
                case 4:
                    System.out.println("Work in progress 4");
                    break;
                case 5:
                    System.out.println("Work in progress 5");
                    break;
                case 6:
                    System.out.println("Have a great day!\n");
                    break;
                default:
                    System.out.println("Please insert a valid option\n");
                    break;
            }
        } while (!exit);
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
            for(int i =0; i < GlobantUniversity.getCourseListAmount(); i++) {
                Course currentCourse = courses.get(i);
                System.out.println(currentCourse.getName());
            }
            System.out.println("\n");
        }
    }



}