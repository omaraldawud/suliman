/*
 * Question 6 - While Loop with Boolean
 * Topic: Loop control using boolean flag
 */
import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        final String CORRECT_PASSWORD = "java123";
        Scanner input = new Scanner(System.in);
        boolean accessGranted = false;

        while (!accessGranted) {
            System.out.print("Enter password: ");
            String password = input.nextLine();

            if (password.equals(CORRECT_PASSWORD)) {
                System.out.println("Access granted!");
                accessGranted = true;
            } else {
                System.out.println("Incorrect, try again.");
            }
        }

        input.close();
    }
}
