package problem_two;

import java.time.LocalDate;

public class Secretary extends DeptEmployee {
    private double overtimeHours;

    public Secretary(String name, double salary, int year, int month, int day) {
        super(name, salary, LocalDate.of(year, month, day));
    }

    public double getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(double overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    @Override
    protected double computeSalary() {
        return super.computeSalary() + 12 * overtimeHours;
    }
}
