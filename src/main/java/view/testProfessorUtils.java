package view;

import controller.IProfessorUtils;
import controller.ProfessorUtilsImlp;
import model.CurrentLesson;
import model.Group;
import model.Professor;
import model.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jack on 09.01.2017.
 */
public class testProfessorUtils {

    public static void main(String[] args) {

        IProfessorUtils iProfessorUtils = new ProfessorUtilsImlp();

        Student student1 = new Student("Vasa", "Ivanow", 4);
        Student student2 = new Student("Peta", "Casyanov", 4.2);
        Student student3 = new Student("Anya", "Kovalova", 4.8);
        Student student4 = new Student("Kola", "Chehov", 4.3);
        Student student5 = new Student("Maria", "Sergeeva", 4.1);
        Student student6 = new Student("Jack", "Simmers", 4.3);
        Student student7 = new Student("Kola", "Chehov", 4.0);

        List<Student> firstGroupStudents = new ArrayList<>();
        firstGroupStudents.add(student1);
        firstGroupStudents.add(student2);
        firstGroupStudents.add(student3);
        firstGroupStudents.add(student4);
        firstGroupStudents.add(student5);
        firstGroupStudents.add(student6);
        firstGroupStudents.add(student7);

        List<Student> presentOnLessonStudents = new ArrayList<>();
        presentOnLessonStudents.add(student1);
        presentOnLessonStudents.add(student2);
        presentOnLessonStudents.add(student3);
        presentOnLessonStudents.add(student4);
        presentOnLessonStudents.add(student5);

        Professor professor = new Professor("Dmitriy" , "Mendileev", 77777, 34);
        CurrentLesson currentLessonAllPresent = new CurrentLesson(professor, firstGroupStudents);

        Group group = new Group("First Group", firstGroupStudents);

        System.out.println("======================");
        System.out.println("Test Students Roll Call" + "\n");

        System.out.println("Positive test:"  + "\n");
        System.out.println("Expected: " + "true");
        System.out.println("Actual: " + iProfessorUtils.StudentsRollCall(currentLessonAllPresent, group));

        System.out.println();
        System.out.println("На занятии присуствуют все студенты.");
        System.out.println("======================");

        CurrentLesson currentLessonWithNotAllPresent = new CurrentLesson(professor, presentOnLessonStudents);

        System.out.println("Negative test:"  + "\n");
        System.out.println("Expected: " + "false");
        System.out.println("Actual: " + iProfessorUtils.StudentsRollCall(currentLessonWithNotAllPresent, group));
    }
}
