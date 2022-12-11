package DataTypesAndVariables.Lab;

import java.util.Scanner;

public class RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= number; i++) {
            int currentNum = i;
            int sum = 0;
            while (currentNum > 0) {
                int lastDigit = currentNum % 10;
                sum += lastDigit;
                currentNum /= 10;
            }
            if (sum == 5 || sum == 7 || sum == 11){
                System.out.printf("%d -> True\n", i);
            } else {
                System.out.printf("%d -> False\n", i);
            }
        }
    }
}
