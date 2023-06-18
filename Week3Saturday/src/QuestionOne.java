import java.util.InputMismatchException;
import java.util.Scanner;

public class QuestionOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write your score: ");

        try {
            int score = sc.nextInt();
            if (score < 0 || score > 100)
                throw new UnsupportedOperationException("The value must be between 0 and 100.");
        } catch (InputMismatchException ime) {
            System.out.println("The program accepts integer value only.");
        } catch (UnsupportedOperationException ue) {
            System.out.println(ue.getMessage());
        }

    }
}
