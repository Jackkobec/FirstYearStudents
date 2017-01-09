package model;

/**
 * Created by Jack on 09.01.2017.
 */
public class Lesson {

    private String lessonName;

    public Lesson() {
    }

    public Lesson(String lessonName) {
        this.lessonName = lessonName;
    }

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Lesson lesson = (Lesson) o;

        return lessonName != null ? lessonName.equals(lesson.lessonName) : lesson.lessonName == null;

    }

    @Override
    public int hashCode() {
        return lessonName != null ? lessonName.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "lessonName='" + lessonName + '\'' +
                '}';
    }
}
