import java.util.Random;

public class RollDice {
    public static void main(String[] args) {
        Random rand = new Random();


        int dice = rand.nextInt(6) + 1; // random number between 1–6
        System.out.println("🎲 You rolled a: " + dice);

        // Teacher explanation:
        // rand.nextInt(6) returns values 0–5 → adding +1 makes it 1–6
    }


}
