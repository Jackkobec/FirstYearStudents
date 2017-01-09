package model;

/**
 * Created by Jack on 09.01.2017.
 */
public class Professor {

    private String name;
    private String secondName;

    double salary;
    double workExperience;

    public Professor() {
    }

    public Professor(String name, String secondName, double salary, double workExperience) {
        this.name = name;
        this.secondName = secondName;
        this.salary = salary;
        this.workExperience = workExperience;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(double workExperience) {
        this.workExperience = workExperience;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Professor professor = (Professor) o;

        if (Double.compare(professor.salary, salary) != 0) return false;
        if (Double.compare(professor.workExperience, workExperience) != 0) return false;
        if (name != null ? !name.equals(professor.name) : professor.name != null) return false;
        return secondName != null ? secondName.equals(professor.secondName) : professor.secondName == null;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        result = 31 * result + (secondName != null ? secondName.hashCode() : 0);
        temp = Double.doubleToLongBits(salary);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(workExperience);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "model.Professor{" +
                "name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", salary=" + salary +
                ", workExperience=" + workExperience +
                '}';
    }
}


