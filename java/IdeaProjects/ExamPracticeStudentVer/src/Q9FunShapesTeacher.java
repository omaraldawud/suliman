import java.util.Scanner;

public class Q9FunShapesTeacher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Exercise 1: Right Triangle of Stars ===");
        System.out.print("Enter height: ");
        int height1 = sc.nextInt();
        String row1 = "";
        for (int i = 1; i <= height1; i++) {
            row1 += "*";
            System.out.println(row1);
        }

        System.out.println("\n=== Exercise 2: Inverted Right Triangle ===");
        System.out.print("Enter height: ");
        int height2 = sc.nextInt();
        for (int i = height2; i >= 1; i--) {
            System.out.println("*".repeat(i));
        }

        System.out.println("\n=== Exercise 3: Square of Stars ===");
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        String squareRow = "*".repeat(size);
        for (int i = 0; i < size; i++) {
            System.out.println(squareRow);
        }

        System.out.println("\n=== Exercise 4: Number Step Pattern ===");
        System.out.print("Enter height: ");
        int height4 = sc.nextInt();
        String numbers = "";
        for (int i = 1; i <= height4; i++) {
            numbers += i;
            System.out.println(numbers);
        }

        System.out.println("\n=== Exercise 5: Countdown Stars ===");
        System.out.print("Enter height: ");
        int height5 = sc.nextInt();
        for (int i = height5; i >= 1; i--) {
            System.out.println("*".repeat(i));
        }
        System.out.println("Blast Off!");

        System.out.println("\n=== Exercise 6: Step Pyramid with Numbers ===");
        System.out.print("Enter height: ");
        int height6 = sc.nextInt();
        for (int i = 1; i <= height6; i++) {
            System.out.println(String.valueOf(i).repeat(i));
        }

        sc.close();
    }}

