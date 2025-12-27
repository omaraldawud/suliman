import java.util.Scanner;

public class StringExercisesSolution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== STRING EXERCISES (Teacher Version) ===");

        // Q1: Length and Characters
        System.out.print("\n    --------------- Q1: Length and Characters   ---------------");

        System.out.print("\nEnter your name: ");
        String name = input.nextLine();
        System.out.println("Number of characters: " + name.length());
        System.out.println("First letter: " + name.charAt(0));
        System.out.println("Last letter: " + name.charAt(name.length() - 1));


        // Q2: Case Conversion
        System.out.print("\n    --------------- Q2: Case Conversion   ---------------");
        System.out.print("\nEnter a word: ");
        String word = input.nextLine();
        System.out.println("Uppercase: " + word.toUpperCase());
        System.out.println("Lowercase: " + word.toLowerCase());


        // Q3: Compare Two Words
        System.out.print("\n    --------------- Q3: Compare Two Words   ---------------");

        System.out.print("\nEnter first word: ");
        String w1 = input.nextLine();
        System.out.print("Enter second word: ");
        String w2 = input.nextLine();
        System.out.println("Equal (case-sensitive)? " + w1.equals(w2));
        System.out.println("Equal (ignore case)? " + w1.equalsIgnoreCase(w2));


        // Q4: Substring Extraction
        System.out.print("\n    --------------- Q4: Substring Extraction  ---------------");
        System.out.print("\nEnter a word: ");
        String text = input.nextLine();
        if (text.length() >= 3) {
            System.out.println("First 3 letters: " + text.substring(0, 3));
            System.out.println("Last 3 letters: " + text.substring(text.length() - 3));
        } else {
            System.out.println("Word too short for substring test.");
        }


        // Q5: Sentence Contains Word
        System.out.print("\n    --------------- Q5: Sentence Contains Word  ---------------");

        System.out.print("\nEnter a sentence: ");
        String sentence = input.nextLine();
        System.out.print("Enter a word to search: ");
        String search = input.nextLine();
        if (sentence.contains(search))
            System.out.println("Sentence contains \"" + search + "\"");
        else
            System.out.println("Not found!");


        // Q6: Replace and Trim
        System.out.print("\n    --------------- Q6: Replace and Trim  ---------------");

        System.out.print("\nEnter a sentence with spaces: ");
        String spaced = input.nextLine();
        System.out.println("Original: [" + spaced + "]");
        System.out.println("Trimmed: [" + spaced.trim() + "]");
        System.out.println("Spaces replaced: " + spaced.replace(" ", "-"));


        // Q7: Count Words
        System.out.print("\n    --------------- Q7: Count Words ---------------");

        System.out.print("\nEnter a short sentence: ");
        String s = input.nextLine();
        String[] words = s.trim().split(" +");
        System.out.println("Word count: " + words.length);


        // Q8: Palindrome Check
        System.out.print("\n    --------------- Q8: Palindrome Check  ---------------");

        System.out.print("\nEnter a word to check for palindrome: ");
        String pal = input.nextLine();
        String reversed = new StringBuilder(pal).reverse().toString();
        if (pal.equalsIgnoreCase(reversed))
            System.out.println("It's a palindrome!");
        else
            System.out.println("Not a palindrome.");


        // Q9: Greeting with Initials
        System.out.print("\n    --------------- Q9: Greeting with Initials  ---------------");

        System.out.print("\nEnter first name: ");
        String first = input.nextLine();
        System.out.print("Enter last name: ");
        String last = input.nextLine();
        char initial1 = first.charAt(0);
        char initial2 = last.charAt(0);
        System.out.println("Hello, " + first + " " + last + "! Your initials are " + initial1 + "." + initial2 + ".");


        // Q10: Replace Vowels
        System.out.print("\n    --------------- Q10: Replace Vowels ---------------");

        System.out.print("\nEnter a word: ");
        String vowels = input.nextLine();
        String replaced = vowels.replaceAll("[aeiouAEIOU]", "*");
        System.out.println("After replacing vowels: " + replaced);


        input.close();
        System.out.println("\n=== END OF TEACHER VERSION ===");
    }
}

