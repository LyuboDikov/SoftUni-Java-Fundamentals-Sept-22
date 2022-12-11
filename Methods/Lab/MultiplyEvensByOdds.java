package Methods.Lab;

import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Math.abs(Integer.parseInt(scanner.nextLine()));

        System.out.println(getMultipleOfEvenAndOdds(input));

    }
    public static int getMultipleOfEvenAndOdds(int num){
        int evenSum = getEvenSum(num);
        int oddSum = getOddSum(num);

        return evenSum * oddSum;
    }

    public static int getEvenSum(int n){
        int evenSum = 0;
        while(n > 0) {
            int lastDigit = n % 10;
            if (lastDigit % 2 == 0) {
                evenSum += lastDigit;
            }
            n /= 10;
        }
        return evenSum;
    }

    public static int getOddSum(int n){
        int oddSum = 0;
        while(n > 0) {
            int lastDigit = n % 10;
            if (lastDigit % 2 != 0) {
                oddSum += lastDigit;
            }
            n /= 10;
        }
        return oddSum;
    }
}
