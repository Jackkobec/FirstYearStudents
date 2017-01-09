package model;

import java.util.List;

/**
 * Created by Jack on 09.01.2017.
 */
public class CurrentLesson extends Lesson {

    private Professor professor;
    private List<Student> presentStudents;



    public CurrentLesson(Professor professor, List<Student> presentStudents) {
        this.professor = professor;
        this.presentStudents = presentStudents;
    }

    public CurrentLesson(String lessonName, Professor professor, List<Student> presentStudents) {
        super(lessonName);
        this.professor = professor;
        this.presentStudents = presentStudents;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Student> getPresentStudents() {
        return presentStudents;
    }

    public void setPresentStudents(List<Student> presentStudents) {
        this.presentStudents = presentStudents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        CurrentLesson that = (CurrentLesson) o;

        if (professor != null ? !professor.equals(that.professor) : that.professor != null) return false;
        return presentStudents != null ? presentStudents.equals(that.presentStudents) : that.presentStudents == null;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (professor != null ? professor.hashCode() : 0);
        result = 31 * result + (presentStudents != null ? presentStudents.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "CurrentLesson{" +
                "professor=" + professor +
                ", presentStudents=" + presentStudents +
                '}';
    }
}
