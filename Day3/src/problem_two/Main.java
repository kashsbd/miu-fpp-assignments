package problem_two;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter your first name:");
        final String firstName = sc.nextLine();

        System.out.println("Please, enter your last name:");
        final String lastName = sc.nextLine();

        System.out.println("Please, enter your birth date in the format-(yyyy-mm-dd)-Example 1989-4-14:");
        final String strBirthDate = sc.nextLine();

        LocalDate birthDate = LocalDate.now();
        try {
            birthDate = LocalDate.parse(strBirthDate);
        } catch (DateTimeParseException e) {
            System.out.println("Error! Please type your birth date again.");
        }

        HeartRates hr = new HeartRates(firstName, lastName, birthDate);
        System.out.println(hr);
    }
}
