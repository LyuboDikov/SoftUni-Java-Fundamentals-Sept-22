package DataTypesAndVariables.MoreExercises;

import java.util.Scanner;

public class RefactoringPrimeChecker {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        for (int num = 2; num <= number; num++) {
            boolean isPrime = true;
            for (int divisor = 2; divisor < num; divisor++) {
                if (num % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }
            System.out.printf("%d -> %b%n", num, isPrime);
        }

    }
}
