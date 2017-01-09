package view;

import controller.IStudentUtils;
import controller.StudentUtilsImlp;
import model.Group;
import model.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jack on 09.01.2017.
 */
public class TestStudentUtils {

    public static void main(String[] args) {

        IStudentUtils iStudentUtils = new StudentUtilsImlp();
        //Test Data
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

        Group group = new Group("First Group", firstGroupStudents);
        System.out.println("======================");
        System.out.println("Test elections of monitor:" + "\n");

        System.out.println("Positive test:"  + "\n");
        System.out.println("Expected: " + "model.Student{name='Anya', secondName='Kovalova', gpa=4.8, studentType=MONITOR}");

        Student newMonitor = iStudentUtils.electionsOfMonitor(group);
        System.out.println("Actual: " + newMonitor);

        System.out.println();
        System.out.println("В группе " + group.getGroupName() + " выбрали старосту: "
                + newMonitor.getName() + " "  +newMonitor.getSecondName());
        System.out.println("======================");

        List<Student> emptyList = new ArrayList<>();
        Group group2 = new Group("Negative Test:", emptyList);

        System.out.println("Negative test"  + "\n");
        System.out.println("Expected: " + "null");
        System.out.println("Actual: " + iStudentUtils.electionsOfMonitor(group2));
        System.out.println("======================");
    }
}
