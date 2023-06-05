package problem_two;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Professor professorOne = new Professor("James", 1000000, 2007, 12, 1);
        Professor professorTwo = new Professor("Robert", 900000, 2008, 10, 5);
        Professor professorThree = new Professor("John", 800000, 2010, 8, 1);

        Secretary secretaryOne = new Secretary("Michael", 750000, 2012, 4, 6);
        secretaryOne.setOvertimeHours(10);
        Secretary secretaryTwo = new Secretary("David", 700000, 2015, 3, 9);
        secretaryTwo.setOvertimeHours(5);

        DeptEmployee[] department = new DeptEmployee[5];
        department[0] = professorOne;
        department[1] = professorTwo;
        department[2] = professorThree;
        department[3] = secretaryOne;
        department[4] = secretaryTwo;

        System.out.print("Do you wish to see all the sum of Professor and Secretary salary? ");
        Scanner sc = new Scanner(System.in);
        if (sc.next().equals("Y")) {
            double totalSalary = 0.0;
            for (DeptEmployee employee : department) {
                totalSalary += employee.computeSalary();
            }
            System.out.println("The total salary is: " + totalSalary);
        }
    }
}
