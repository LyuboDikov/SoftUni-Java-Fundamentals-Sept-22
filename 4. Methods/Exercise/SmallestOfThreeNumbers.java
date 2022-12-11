package Methods.Exercise;

import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());

        int min = getSmallestNumber(firstNumber, secondNumber, thirdNumber);

        System.out.println(min);

    }

    public static int getSmallestNumber(int num1, int num2, int num3){

        int min1 = Math.min(num1, num2);
        int min2 = Math.min(num1, num3);
        int min = Math.min(min1, min2);

        return min;
    }
}
