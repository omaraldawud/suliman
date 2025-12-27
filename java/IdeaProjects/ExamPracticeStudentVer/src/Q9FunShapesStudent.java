// FunShapesStudent.java
// Starter code for Java loop exercises - drawing shapes and patterns
// No nested loops required

import java.util.Scanner;

public class Q9FunShapesStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Exercise 1: Right Triangle of Stars ===");
        System.out.print("Enter height: ");
        int height1 = sc.nextInt();
        // TODO: Draw right triangle

        System.out.println("\n=== Exercise 2: Inverted Right Triangle ===");
        System.out.print("Enter height: ");
        int height2 = sc.nextInt();
        // TODO: Draw inverted triangle

        System.out.println("\n=== Exercise 3: Square of Stars ===");
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        // TODO: Draw square

        System.out.println("\n=== Exercise 4: Number Step Pattern ===");
        System.out.print("Enter height: ");
        int height4 = sc.nextInt();
        // TODO: Draw number steps

        System.out.println("\n=== Exercise 5: Countdown Stars ===");
        System.out.print("Enter height: ");
        int height5 = sc.nextInt();
        // TODO: Draw countdown

        System.out.println("\n=== Exercise 6: Step Pyramid with Numbers ===");
        System.out.print("Enter height: ");
        int height6 = sc.nextInt();
        // TODO: Draw number pyramid

        sc.close();
    }
}
