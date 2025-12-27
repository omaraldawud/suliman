import java.util.Scanner;

public class Main {




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] grades = new double[5];
        int[] students  = new int[5];          //

        students[0]= 40;
        students[1] = 55;
        students[2] = 63;
        students[3] = 15;
        students[4] = 22;


 //       int sumOfElements = students[0] + students[1] + students[2] + students[3] + students[4];
 //       System.out.println("Sum = " + sumOfElements);

        // pattern - algorithm to sum elements of the array
        int newSum  = 0 ;
        for(int i = 0; i < students.length;  i++) {
            newSum = newSum + students[i];
        }
        System.out.println("New Sum = " + newSum);
        System.out.println("Avg = " + newSum/students.length);

        // build an array of 10000 elemetns and init its values to 1

        int[] oneArray = new int[10000];

        for (int i = 0; i < oneArray.length; i++) {
           oneArray[i] = 1;
        }


        sc.close();
    }
}

/*
-----------------------------------------
EXERCISES
-----------------------------------------
Exercise 0: sum all elements of the array and then print the average.

Exercise 1: Find the largest number in an array.
Exercise 2: Count how many students are even.
Exercise 3: Compute the sum of an array of integers.
Exercise 4: Given: int[] a = {4, 2, 9, 1, 5};
            Print all values backwards.
*/

/* enhanced loop
int count = 0;
for (int x : nums) {
    if (x % 2 == 0) count++;
}
 */