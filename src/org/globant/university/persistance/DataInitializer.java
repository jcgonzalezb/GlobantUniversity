package org.globant.university.persistance;

import org.globant.university.data.Student;
import org.globant.university.data.TeacherFullTime;
import org.globant.university.data.TeacherPartTime;
import org.globant.university.data.University;

public class DataInitializer {
    public static University loadUniversity() {
        University GlobantUniversity = new University("Globant University");
        return GlobantUniversity;
    }

    public static void loadStudentsIntoUni(University GlobantUniversity) {
        Student student1 = new Student("Juan", 1, 17);
        Student student2 = new Student("Diego", 2, 21);
        Student student3 = new Student("Maria",3,20);
        Student student4 = new Student("Jose", 4, 23);
        Student student5 = new Student("Ana", 5, 24);
        Student student6 = new Student("Ken", 6, 25);
        GlobantUniversity.insertStudent(student1);
        GlobantUniversity.insertStudent(student2);
        GlobantUniversity.insertStudent(student3);
        GlobantUniversity.insertStudent(student4);
        GlobantUniversity.insertStudent(student5);
        GlobantUniversity.insertStudent(student6);

    }

    public static void loadFullTimeTeachersIntoUni(TeacherFullTime TeacherFullTime) {
        TeacherFullTime teacherFullTime1 = new TeacherFullTime("York", 400, 4);
        TeacherFullTime teacherFullTime2 = new TeacherFullTime("Priyanto", 400, 5 );
    }

    public static void loadPartTimeTeachersIntoUni(TeacherPartTime TeacherPartTime) {
        TeacherPartTime teacherPartTime1 = new TeacherPartTime("Marcus", 200, 20);
        TeacherPartTime teacherPartTime2 = new TeacherPartTime("Valeria", 200, 30);
    }


}
