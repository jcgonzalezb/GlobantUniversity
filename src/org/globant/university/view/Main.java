package org.globant.university.view;

import com.sun.org.apache.xpath.internal.functions.FuncFalse;
import org.globant.university.data.*;
import org.globant.university.persistance.DataInitializer;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        University GlobantUniversity = DataInitializer.loadUniversity();
        System.out.println("Welcome to " + GlobantUniversity.getName() + "\n");
        DataInitializer.loadInitialDataIntoUni(GlobantUniversity);
        displayInitialMenu(GlobantUniversity);
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
                    System.out.println("");
                    printTeacherListData(GlobantUniversity);
                    break;
                case 2:
                    System.out.println("");
                    printCourseList(GlobantUniversity);
                    displayCourseMenu(GlobantUniversity);
                    break;
                case 3:
                    System.out.println("");
                    insertNewStudentIntoCourse(GlobantUniversity);
                    break;
                case 4:
                    System.out.println("");
                    insertNewCourse(GlobantUniversity);
                    break;
                case 5:
                    System.out.println("");
                    searchStudent(GlobantUniversity);
                    break;
                case 6:
                    System.out.println("Have a great day!\n");
                    exit = true;
                    break;
                default:
                    System.out.println("");
                    System.out.println("Please insert a valid option\n");
                    break;
            }
        } while (!exit);
    }

    public static void displayCourseMenu(University GlobantUniversity) {
        Scanner scan = new Scanner(System.in);
        boolean exit = false;
        do {
            System.out.println("Select an option:\n");
            System.out.println("1.  Select the course to print the course data, including teacher and students");
            System.out.println("2.  Return to the previous menu");
            int option = scan.nextInt();
            scan = new Scanner(System.in);
            switch (option) {
                case 1:
                    printCourseData(GlobantUniversity);
                    break;
                case 2:
                    System.out.println("Return to the previous menu\n");
                    exit = true;
                    break;
                default:
                    System.out.println("Please insert a valid option\n");
                    break;
            }
        } while (!exit);
    }


    public static void printCourseData(University GlobantUniversity) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Write down the code of the course");
        Integer tempCourse = scan.nextInt();
        scan = new Scanner(System.in);
        List<Course> courses = GlobantUniversity.getCourseList();
        System.out.println("Course information:");
        for (int i = 0; i < GlobantUniversity.getCourseListAmount(); i++) {
            Course currentCourse = courses.get(i);
            if (!Objects.equals(tempCourse, currentCourse.getId())) {
                System.out.print("");
            } else {
                System.out.println("Id: \t" + currentCourse.getId());
                System.out.println("Course name: \t" + currentCourse.getName());
                System.out.println("Classroom number: \t" + currentCourse.getClassroom());
                System.out.println("Teacher name: \t" + currentCourse.getTeacherName());
                System.out.println("List of students: ");
                System.out.println("id \t\t\t Student name");
                List<Student> studentsCourse = currentCourse.getStudentListCourse();
                for (int j = 0; j < currentCourse.studentListCourse.size(); j++) {
                    Student currentStudent = studentsCourse.get(j);
                    System.out.print(currentStudent.getId() + "\t\t" + currentStudent.getName());
                    System.out.println("");
                }
            }
        }
    }

    public static void printStudentList(University GlobantUniversity) {
        if (GlobantUniversity.getStudentListAmount() == 0) {
            System.out.println("No students registered on the university.\n");
        } else {
            List<Student> students = GlobantUniversity.getStudentList();
            System.out.println("List of students: ");
            System.out.println("id \t\t\t Student name");
            for (int i = 0; i < GlobantUniversity.getStudentListAmount(); i++) {
                Student currentStudent = students.get(i);
                System.out.print(currentStudent.getId()+ "\t\t" + currentStudent.getName() + "\n");
            }
            System.out.println("\n");
        }
    }

    public static void printTeacherList(University GlobantUniversity) {
        List<Teacher> teacher = GlobantUniversity.getTeacherList();
        System.out.println("List of teachers:");
        for (int i = 0; i < GlobantUniversity.getTeacherAmount(); i++) {
            Teacher currentTeacher = teacher.get(i);
            System.out.print(currentTeacher.getName() + "\n");
        }
        System.out.println("\n");
    }


    public static void printCourseList(University GlobantUniversity) {
        if (GlobantUniversity.getCourseListAmount() == 0) {
            System.out.println("No courses registered on the university.\n");
        } else {
            System.out.println("List of courses:");
            List<Course> courses = GlobantUniversity.getCourseList();
            System.out.println("id \t\t Course");
            for (int i = 0; i < GlobantUniversity.getCourseListAmount(); i++) {
                Course currentCourse = courses.get(i);
                System.out.print(currentCourse.getId() + "\t\t" + currentCourse.getName() + "\n");
            }
            System.out.println("");
        }
    }

    public static void printTeacherListData(University GlobantUniversity) {
        List<Teacher> teacher = GlobantUniversity.getTeacherList();
        System.out.println("Teacher Name \t\t Salary (USD)");
        for (int i = 0; i < GlobantUniversity.getTeacherAmount(); i++) {
            Teacher currentTeacher = teacher.get(i);
            System.out.print(currentTeacher.getName() + "\t\t" + currentTeacher.totalSalary() + "\n");
        }
        System.out.println("\n");
    }

    public static void insertNewStudentIntoCourse(University GlobantUniversity) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Write down the name of the new student");
        String tempName = scan.nextLine();
        scan = new Scanner(System.in);
        System.out.println("Write down the age of the new student");
        Integer tempAge = scan.nextInt();
        scan = new Scanner(System.in);
        Student newStudent = new Student(tempName, tempAge);
        GlobantUniversity.insertStudent(newStudent);
        printCourseList(GlobantUniversity);
        System.out.println("Write down the code of the existing course to add the new student");
        Integer tempCourse = scan.nextInt();
        scan = new Scanner(System.in);
        List<Course> courses = GlobantUniversity.getCourseList();
        for (int i = 0; i < GlobantUniversity.getCourseListAmount(); i++) {
            Course currentCourse = courses.get(i);
            if (tempCourse.equals(currentCourse.getId())) {
                currentCourse.insertStudentCourse(newStudent);
                System.out.println("A new student has been added to " + currentCourse.getName() + " course!\n");
            }
        }
    }

    public static void insertNewCourse(University GlobantUniversity) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Write down the name of the new course");
        String newCourseName = scan.nextLine();
        scan = new Scanner(System.in);
        System.out.println("Write down the number of the classroom (Choose a number from 100 to 120)");
        Integer existingClassroom = scan.nextInt();
        scan = new Scanner(System.in);
        ArrayList<Student> studentNewCourseList = new ArrayList<>();
        printTeacherList(GlobantUniversity);
        System.out.println("Write down the name of the existing teacher");
        String existingTeacher = scan.nextLine();
        scan = new Scanner(System.in);
        List<Teacher> teacher = GlobantUniversity.getTeacherList();
        List<String> teacherString = GlobantUniversity.getTeacherStringList();
        for (int i = 0; i < GlobantUniversity.getTeacherAmount(); i++) {
            Teacher currentTeacher = teacher.get(i);
            teacherString.add(currentTeacher.getName());
        }
        if (!teacherString.contains(existingTeacher)) {
            System.out.println("The teacher inserted is not part of the University");
        } else {
            for (int i = 0; i < GlobantUniversity.getTeacherAmount(); i++) {
                Teacher currentTeacher = teacher.get(i);
                if (existingTeacher.equals(currentTeacher.getName())) {
                    System.out.println("The teacher is part of the University.");
                    Course newCourse = new Course(newCourseName, existingClassroom, currentTeacher, studentNewCourseList);
                    GlobantUniversity.insertCourse(newCourse);
                    System.out.println(currentTeacher.getName() + " has been assigned to the new " + newCourseName + " course!\n");
                    boolean exit = false;
                    do {
                        System.out.println("Select an option:\n");
                        System.out.println("1.  Insert existing students to the new course");
                        System.out.println("2.  Return to the previous menu");
                        int option = scan.nextInt();
                        scan = new Scanner(System.in);
                        switch (option) {
                            case 1:
                                System.out.println("Write down the name of the existing student");
                                String existingStudent = scan.nextLine();
                                scan = new Scanner(System.in);
                                List<Student> students = GlobantUniversity.getStudentList();
                                List<String> studentString = GlobantUniversity.getStudentStringList();
                                for (int j = 0; j < GlobantUniversity.getStudentListAmount(); j++) {
                                    Student currentStudent = students.get(j);
                                    studentString.add(currentStudent.getName());
                                }
                                if (!studentString.contains(existingStudent)) {
                                    System.out.println("The student inserted is not part of the University");
                                } else {
                                    for (int j = 0; j < GlobantUniversity.getStudentListAmount(); j++) {
                                        Student currentStudent = students.get(j);
                                        if (existingStudent.equals(currentStudent.getName())) {
                                            System.out.println("The student is part of the University.");
                                            newCourse.insertStudentCourse(currentStudent);
                                            System.out.println(currentStudent.getName() + " has been assigned to the new " + newCourseName + " course!\n");
                                        }
                                    }
                                }
                                break;
                            case 2:
                                System.out.println("Return to the previous menu\n");
                                exit = true;
                                break;
                            default:
                                System.out.println("Please insert a valid option\n");
                                break;
                        }
                    } while (!exit);
                }
            }
        }
    }


    public static void searchStudent(University GlobantUniversity) {
        Scanner scan = new Scanner(System.in);
        printStudentList(GlobantUniversity);
        System.out.println("Write down the id of the student you want ot learn about");
        Integer searchStudent = scan.nextInt();
        scan = new Scanner(System.in);
        List<Student> students = GlobantUniversity.getStudentList();
        List<Integer> studentInteger = GlobantUniversity.getStudentIntList();
        for (int j = 0; j < GlobantUniversity.getStudentListAmount(); j++) {
            Student currentStudent = students.get(j);
            studentInteger.add(currentStudent.getId());
        }
        if (!studentInteger.contains(searchStudent)) {
            System.out.println("The student inserted is not part of the University");
        } else {
            List<Course> courses = GlobantUniversity.getCourseList();
            for (int i = 0; i < GlobantUniversity.getCourseListAmount(); i++) {
                Course currentCourse = courses.get(i);
                List<Student> studentsCourse = currentCourse.getStudentListCourse();
                List<Integer> studentInt = currentCourse.getStudentListCourseInt();
                List<Integer> studentFound = currentCourse.getStudentListCourseInt();
                for (int j = 0; j < currentCourse.getStudentListCourseAmount(); j++) {
                    Student currentStudent = studentsCourse.get(j);
                    studentInt.add(currentStudent.getId());
                }
                if (!studentInt.contains(searchStudent)) {
                    System.out.print("");
                } else {
                    studentFound.add(searchStudent);
                    System.out.println("The student is part of the University.");
                    System.out.println("The Student with id " + searchStudent + " is part of the " + currentCourse.getName() + " course. \n");
                }
            }
        }
    }
}
