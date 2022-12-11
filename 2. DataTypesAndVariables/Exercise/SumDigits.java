package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int sumDigits = 0;
        while (number > 0){
            int lastDigit = number % 10;
            sumDigits += lastDigit;
            number /= 10;
        }
        System.out.println(sumDigits);
    }
}
