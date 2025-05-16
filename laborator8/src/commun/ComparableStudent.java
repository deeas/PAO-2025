package commun;

public class ComparableStudent extends Student implements Comparable<Student> {
    public ComparableStudent(String firstName, String lastName, long age) {
        super(firstName, lastName, age);
    }

    @Override
    public int compareTo(Student o) {
        if (this.firstName.equals(o.firstName)){
            return this.lastName.compareTo(o.lastName);
        } else {
            return this.firstName.compareTo(o.firstName);
        }
    }
}
