package problem_two;

import java.time.LocalDate;
import java.time.Period;

public class HeartRates {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;

    private final int RESTING_HEART_RATE = 70;
    private final float LOWER_BOUNDARY = 0.5f;
    private final float UPPER_BOUNDARY = 0.85f;

    public HeartRates(String firstName, String lastName, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;

        printTargetHeartRateRange();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    private int getAge() {
        return Period.between(dateOfBirth, LocalDate.now()).getYears();
    }

    private int getMaximumHeartRate() {
        return 220 - getAge();
    }

    private void printTargetHeartRateRange() {
        final int averageHeartRate = getMaximumHeartRate() - RESTING_HEART_RATE;
        final float lowerBoundaryTargetHeartRate = (averageHeartRate * LOWER_BOUNDARY) + RESTING_HEART_RATE;
        final float upperBoundaryTargetHeartRate = (averageHeartRate * UPPER_BOUNDARY) + RESTING_HEART_RATE;

        System.out.println("The Target Heart Rate Range is between " + lowerBoundaryTargetHeartRate + " and " + upperBoundaryTargetHeartRate);
    }

    @Override
    public String toString() {
        String strToReturn = "";
        strToReturn += "First Name : " + firstName + "\n";
        strToReturn += "Last Name : " + lastName + "\n";
        strToReturn += "Age : " + getAge() + "\n";
        strToReturn += "Date of Birth : " + dateOfBirth.toString() + "\n";
        strToReturn += "Maximum Heart Rate : " + getMaximumHeartRate() + "\n";
        return strToReturn;
    }
}
