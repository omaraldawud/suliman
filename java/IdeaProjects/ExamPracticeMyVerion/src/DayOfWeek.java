/*
 * Question 4 - Switch Statement
 * Topic: Selection structure using switch-case
 */
import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter day number (1-7): ");
        int day = input.nextInt();

        switch (day) {
            case 1 -> System.out.println("It is Monday.");
            case 2 -> System.out.println("It is Tuesday.");
            case 3 -> System.out.println("It is Wednesday.");
            case 4 -> System.out.println("It is Thursday.");
            case 5 -> System.out.println("It is Friday.");
            case 6 -> System.out.println("It is Saturday.");
            case 7 -> System.out.println("It is Sunday.");
            default -> System.out.println("Invalid day number.");
        }

        input.close();
    }
}
