import java.util.Random;

import java.util.Random;
import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        String choice;
        do {
            boolean isHeads = rand.nextBoolean();
            String result = isHeads ? "Heads" : "Tails";
            System.out.println("🪙 The coin shows: " + result);

            System.out.print("Do you want to flip again? (Y/N): ");
            choice = input.nextLine();

        } while (!choice.equalsIgnoreCase("n"));

        System.out.println("Goodbye! Thanks for playing!");
        input.close();
    }
}

