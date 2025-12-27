import java.util.Scanner;

/**
 * String Exercises
 * ----------------
 * Practice working with common String methods in Java.
 * Fill in each section where indicated with your code.
 */

public class StringExercises {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== STRING EXERCISES ===");

        // Q1: Length and Characters
        System.out.print("\nEnter your name: ");
        String name = input.nextLine();
        // TODO: print number of characters and first/last letter
        // Answer here:


        // Q2: Case Conversion
        System.out.print("\nEnter a word: ");
        String word = input.nextLine();
        // TODO: print the word in uppercase and lowercase
        // Answer here:


        // Q3: Compare Two Words
        System.out.print("\nEnter first word: ");
        String w1 = input.nextLine();
        System.out.print("Enter second word: ");
        String w2 = input.nextLine();
        // TODO: compare the words (case-sensitive and ignore-case)
        // Answer here:


        // Q4: Substring Extraction
        System.out.print("\nEnter a word: ");
        String text = input.nextLine();
        // TODO: print first 3 and last 3 letters
        // Answer here:


        // Q5: Sentence Contains Word
        System.out.print("\nEnter a sentence: ");
        String sentence = input.nextLine();
        System.out.print("Enter a word to search: ");
        String search = input.nextLine();
        // TODO: check if the sentence contains the word
        // Answer here:


        // Q6: Replace and Trim
        System.out.print("\nEnter a sentence with spaces: ");
        String spaced = input.nextLine();
        // TODO: print before and after replace/trim
        // Answer here:


        // Q7: Count Words
        System.out.print("\nEnter a short sentence: ");
        String s = input.nextLine();
        // TODO: split by space and count words
        // Answer here:


        // Q8: Palindrome Check
        System.out.print("\nEnter a word to check for palindrome: ");
        String pal = input.nextLine();
        // TODO: check if it reads same forward and backward
        // Answer here:


        // Q9: Greeting with Initials
        System.out.print("\nEnter first name: ");
        String first = input.nextLine();
        System.out.print("Enter last name: ");
        String last = input.nextLine();
        // TODO: print greeting with initials
        // Answer here:


        // Q10: Replace Vowels
        System.out.print("\nEnter a word: ");
        String vowels = input.nextLine();
        // TODO: replace all vowels with '*'
        // Answer here:


        input.close();
        System.out.println("\n=== END OF EXERCISES ===");
    }
}
