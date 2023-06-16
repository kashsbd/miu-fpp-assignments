import java.util.Objects;

public class Student {
    private String firstName;
    private String lastName;
    private double gpa;
    private Standing standing;

    public Student(String firstName, String lastName, double gpa, Standing standing) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
        this.standing = standing;
    }

    public Standing getStanding() {
        return standing;
    }

    public double getGpa() {
        return gpa;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "[" + firstName + " " + lastName + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Double.compare(student.gpa, gpa) == 0 && Objects.equals(firstName, student.firstName) && Objects.equals(lastName, student.lastName) && standing == student.standing;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, gpa, standing);
    }
}
