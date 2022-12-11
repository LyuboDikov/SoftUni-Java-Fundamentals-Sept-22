package Methods.MoreExercise;

import java.util.Scanner;

public class TribonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        printTribonacciNumbers(n);

    }

    public static void printTribonacciNumbers (int number){

        int previousNumber = 0;
        int nextNumber = 1;
        int currentNumber = 1;
        int sum = 0;
        for (int i = 1; i <= number ; i++) {
            System.out.printf("%d ", currentNumber);
            sum = previousNumber + currentNumber + nextNumber;
            previousNumber = currentNumber;
            currentNumber = nextNumber;
            nextNumber = sum;
        }
    }
}
