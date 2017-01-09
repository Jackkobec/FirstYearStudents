package controller;

import model.Group;
import model.Student;
import model.StudentType;

import java.util.Comparator;

/**
 * Created by Jack on 09.01.2017.
 */
public class StudentUtilsImlp implements IStudentUtils {

    /**
     * Elect monitor by best Gpa(average rating).
     *
     * @param group
     * @return elected monitor
     */
    public Student electionsOfMonitor(Group group) {
        //incoming data validation
        if (group == null || group.getGroupStudents().size() == 0) return null;

        if (group.getGroupStudents().size() == 1) return group.getGroupStudents().get(0);

        //elect MONITOR by max Gpa(average rating) - выбираем старосту по максимальному среднему балу
        Student elected = group.getGroupStudents().stream().max(Comparator.comparingDouble(Student::getGpa)).get();
        elected.setStudentType(StudentType.MONITOR);

        return elected;
    }
}


