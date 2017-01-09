package controller;

import model.CurrentLesson;
import model.Group;
import model.Student;

import java.util.List;

/**
 * Created by Jack on 09.01.2017.
 */
public class ProfessorUtilsImlp implements IProfessorUtils {

    /**
     * Check are all users presen in the current lesson.
     *
     * @param currentLesson
     * @param group
     * @return true if all students present on lesson
     */
    @Override
    public boolean StudentsRollCall(CurrentLesson currentLesson, Group group) {
        //incoming data validation
        if (currentLesson == null || group == null) {
            throw new NullPointerException("Incorrect incoming data!");
        }

        List<Student> allGroupStudents = group.getGroupStudents();
        List<Student> presentOnLessonStudents = currentLesson.getPresentStudents();
        //there are no students in the lesson
        if (presentOnLessonStudents.size() == 0)
            return false;
        //check are all students present
        if (allGroupStudents.size() == presentOnLessonStudents.size()
                && allGroupStudents.containsAll(presentOnLessonStudents)) {

            return true;

        } else {
            allGroupStudents.removeAll(presentOnLessonStudents);
            showWhoIsAbsent(allGroupStudents);
        }

        return false;
    }

    /**
     * Show absent students on the console
     *
     * @param absentStudents
     */
    @Override
    public void showWhoIsAbsent(List<Student> absentStudents) {

        System.out.println("Absent students: ");
        absentStudents.forEach(System.out::println);
    }
}
