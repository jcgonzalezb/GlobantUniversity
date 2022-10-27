package org.globant.university.view;

import org.globant.university.data.Student;
import org.globant.university.data.TeacherFullTime;
import org.globant.university.data.TeacherPartTime;
import org.globant.university.data.University;
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
        if (GlobantUniversity.getStudentAmount() == 0) {
            System.out.println("No students registered on the university.\n");
        } else {
            List<Student> students = GlobantUniversity.getStudentList();
            System.out.println("List of students: ");
            for(int i =0; i < GlobantUniversity.getStudentAmount(); i++) {
                Student currentStudent = students.get(i);
                System.out.println(currentStudent.getName());
                System.out.println(currentStudent.getId());
            }
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
        if (GlobantUniversity.getStudentAmount() == 0) {
            System.out.println("No students registered on the university.\n");
        } else {
            TeacherListComplete(GlobantUniversity);
            List<String> teachers = GlobantUniversity.getTeacherCompleteList();
            System.out.println("List of teachers: ");
            for(int i =0; i < GlobantUniversity.getTeacherCompleteListAmount(); i++) {
                String currentStudent = teachers.get(i);
                System.out.println(currentStudent);
            }
        }


    }





}