package org.globant.university.view;

import org.globant.university.data.Student;
import org.globant.university.data.TeacherFullTime;
import org.globant.university.data.TeacherPartTime;
import org.globant.university.data.University;
import org.globant.university.persistance.DataInitializer;

public class Main {
    public static void main(String[] args) {
        University GlobantUniversity = DataInitializer.loadUniversity();
        System.out.println("Welcome to " + GlobantUniversity.getName());
        DataInitializer.loadStudentsIntoUni(GlobantUniversity);
        printStudentList(GlobantUniversity);
    }

    public static void printStudentList(University GlobantUniversity) {
        for(int i =0; i < GlobantUniversity.getStudentAmount(); i++) {
            System.out.println(GlobantUniversity.getStudentByIndex(i));
    }
    }

}