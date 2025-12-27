import java.util.Random;

public class RandomStringBuilderExample {

    public static void main(String[] args) {
        // Create a Random object
        Random rand = new Random();

        // Possible characters (String)
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        // Use StringBuilder to build a random string efficiently
        StringBuilder sb = new StringBuilder();

        // Generate a random 8-character password
        for (int i = 0; i < 8; i++) {
            int index = rand.nextInt(alphabet.length()); // random index
            char randomChar = alphabet.charAt(index);
            sb.append(randomChar); // add char to StringBuilder
        }

        // Convert StringBuilder to a String
        String password = sb.toString();

        System.out.println("Generated random password: " + password);

        // Demonstrate reversing the string
        String reversed = new StringBuilder(password).reverse().toString();
        System.out.println("Reversed password: " + reversed);

        // Demonstrate concatenation with a regular String
        String message = "Your new password is: " + password;
        System.out.println(message);
    }
}
