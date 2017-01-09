package model;

/**
 * Created by Jack on 09.01.2017.
 */
public class Student {

    private String name;
    private String secondName;
    //average rating - средний бал
    private double gpa;
    //by default SIMPLE_STUDENT - просто студент
    private StudentType studentType = StudentType.SIMPLE_STUDENT;

    public Student() {
    }

    public Student(String name, String secondName, double gpa) {
        this.name = name;
        this.secondName = secondName;
        this.gpa = gpa;
    }

    public Student(String name, String secondName, double gpa, StudentType studentType) {
        this.name = name;
        this.secondName = secondName;
        this.gpa = gpa;
        this.studentType = studentType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public StudentType getStudentType() {
        return studentType;
    }

    public void setStudentType(StudentType studentType) {
        this.studentType = studentType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (Double.compare(student.gpa, gpa) != 0) return false;
        if (name != null ? !name.equals(student.name) : student.name != null) return false;
        if (secondName != null ? !secondName.equals(student.secondName) : student.secondName != null) return false;
        return studentType == student.studentType;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        result = 31 * result + (secondName != null ? secondName.hashCode() : 0);
        temp = Double.doubleToLongBits(gpa);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (studentType != null ? studentType.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "model.Student{" +
                "name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", gpa=" + gpa +
                ", studentType=" + studentType +
                '}';
    }
}


