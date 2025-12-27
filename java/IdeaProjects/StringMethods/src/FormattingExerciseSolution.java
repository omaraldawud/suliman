public class FormattingExerciseSolution {

    public static void main(String[] args) {

        String name = "Suleiman";
        int age = 19;
        double gpa = 3.6789;
        double price = 25.5;
        int quantity = 4;

        System.out.println("=== FORMATTING EXERCISES (Teacher Version) ===");

        // Q1
        System.out.printf("Name: %s, Age: %d%n", name, age);

        // Q2
        System.out.printf("GPA: %.2f%n", gpa);

        // Q3
        System.out.printf("Item price: $%.2f, Quantity: %d%n", price, quantity);

        // Q4
        System.out.println("\nProduct      Price");
        System.out.printf("%-10s %6.2f%n", "Apple", 1.20);
        System.out.printf("%-10s %6.2f%n", "Orange", 0.85);
        System.out.printf("%-10s %6.2f%n", "Banana", 0.75);

        // Q5
        String formatted = String.format("%s's GPA is %.2f", name, gpa);
        System.out.println(formatted);

        System.out.println("\n=== END OF TEACHER VERSION ===");
    }
}
