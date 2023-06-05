package problem_two;

import java.time.LocalDate;

public class Professor extends DeptEmployee {

    private int numberOfPublications;

    public Professor(String name, double salary, int year, int month, int day) {
        super(name, salary, LocalDate.of(year, month, day));
    }

    public int getNumberOfPublications() {
        return numberOfPublications;
    }

    public void setNumberOfPublications(int numberOfPublications) {
        this.numberOfPublications = numberOfPublications;
    }
}
