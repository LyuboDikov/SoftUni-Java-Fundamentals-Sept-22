package Methods.Exercise;

import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int number = 1; number <= n; number++) {
            if (isDivisibleBy8(number) && isWithOddDigit(number)) {
                System.out.println(number);
            }
        }
    }

    public static boolean isDivisibleBy8(int number) {

        int digitsSum = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            digitsSum += lastDigit;
            number /= 10;
        }
        return digitsSum % 8 == 0;
    }

    public static boolean isWithOddDigit(int number) {

        while (number > 0) {
            int lastDigit = number % 10;
            if (lastDigit % 2 != 0) {
                return true;
            } else {
                number /= 10;
            }
        }
        return false;
    }
}