package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class IntegerOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int sumFirstAndSecond = firstNum + secondNum;

        int thirdNum = Integer.parseInt(scanner.nextLine());
        int result = sumFirstAndSecond / thirdNum;
        int fourthNum = Integer.parseInt(scanner.nextLine());
        int finalResult = result * fourthNum;
        System.out.println(finalResult);
    }
}
