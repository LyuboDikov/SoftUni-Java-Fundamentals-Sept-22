package Arrays.MoreExercise;

import java.util.Scanner;

public class RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Set it to the number of elements you want in the Fibonacci Series
        int maxNumber = Integer.parseInt(scanner.nextLine());
        int previousNumber = 0;
        int nextNumber = 1;

        for (int i = 1; i < maxNumber; ++i) {

            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
        }
        System.out.println(nextNumber);
    }
}
