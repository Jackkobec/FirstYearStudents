package model;

import java.util.List;

/**
 * Created by Jack on 09.01.2017.
 */
public class Group {

    private String groupName;
    private List<Student> groupStudents;

    public Group() {
    }

    public Group(String groupName, List<Student> groupStudents) {
        this.groupName = groupName;
        this.groupStudents = groupStudents;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public List<Student> getGroupStudents() {
        return groupStudents;
    }

    public void setGroupStudents(List<Student> groupStudents) {
        this.groupStudents = groupStudents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Group group = (Group) o;

        if (groupName != null ? !groupName.equals(group.groupName) : group.groupName != null) return false;
        return groupStudents != null ? groupStudents.equals(group.groupStudents) : group.groupStudents == null;

    }

    @Override
    public int hashCode() {
        int result = groupName != null ? groupName.hashCode() : 0;
        result = 31 * result + (groupStudents != null ? groupStudents.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupName='" + groupName + '\'' +
                ", groupStudents=" + groupStudents +
                '}';
    }
}
