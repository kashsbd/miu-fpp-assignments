package problem_two;

import java.util.*;

public class Statistics {
    /**
     * Polymorphically computes and returns the sum
     * of all the salaries of all the staff/teachers in the list.
     */
    public static double computeSumOfSalaries(List<EmployeeData> aList) {
        double result = 0.0;
        for (EmployeeData ed : aList) {
            result += ed.getComputedSalary();
        }
        return result;
    }
}
