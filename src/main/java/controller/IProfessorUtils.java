package controller;

import model.CurrentLesson;
import model.Group;
import model.Student;

import java.util.List;

/**
 * Created by Jack on 09.01.2017.
 */
public interface IProfessorUtils {

    boolean StudentsRollCall(CurrentLesson currentLesson, Group group);

    void showWhoIsAbsent(List<Student> absentStudents);
}
