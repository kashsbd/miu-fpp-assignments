package problem_three;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter C for Circle");
        System.out.println("Enter R for Rectangle");
        System.out.println("Enter T for Triangle");

        String keyword = sc.nextLine();
        if (keyword.equals("C")) {
            System.out.println("Enter the radius of the Circle");
            double radius = sc.nextDouble();
            Circle circle = new Circle(radius);
            System.out.println("The area of Circle is : " + circle.computeArea());
        } else if (keyword.equals("R")) {
            System.out.println("Enter the width of the Rectangle");
            double width = sc.nextDouble();
            System.out.println("Enter the height of the Rectangle");
            double height = sc.nextDouble();
            Rectangle rectangle = new Rectangle(width, height);
            System.out.println("The area of Rectangle is : " + rectangle.computeArea());
        } else if (keyword.equals("T")) {
            System.out.println("Enter the base of the Triangle");
            double base = sc.nextDouble();
            System.out.println("Enter the height of the Triangle");
            double height = sc.nextDouble();
            Triangle triangle = new Triangle(base, height);
            System.out.println("The area of Rectangle is : " + triangle.computeArea());
        } else {
            System.out.println("Error! You entered wrong keyword.");
        }
    }
}
