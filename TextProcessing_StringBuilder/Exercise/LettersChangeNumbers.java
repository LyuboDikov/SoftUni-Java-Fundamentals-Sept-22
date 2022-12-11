package TextProcessing_StringBuilder.Exercise;

import java.util.Scanner;

public class LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Въвеждаме входните данни, и сплитваме по един или повече space.

        String input = scanner.nextLine();

        String[] inputArray = input.split("\\s+");

        double totalSum = 0;


        for (int position = 0; position < inputArray.length; position++) {
            String currentString = inputArray[position];
             StringBuilder numberSB = new StringBuilder();

            double sum = 0;
            char firstLetter = currentString.charAt(0);
            char secondLetter = currentString.charAt(currentString.length() - 1);

            for (int i = 1; i < currentString.length() - 1; i++) {
                numberSB.append(currentString.charAt(i));
            }

            double number = Double.parseDouble(numberSB.toString());

            if (Character.isUpperCase(firstLetter)) {
                int positionValue = firstLetter - 64;
                sum += number / positionValue;
            } else if (Character.isLowerCase(firstLetter)) {
                int positionValue = firstLetter - 96;
                sum += number * positionValue;
            }

            if (Character.isUpperCase(secondLetter)){
                int positionValue = secondLetter - 64;
                sum -= positionValue;
            } else if (Character.isLowerCase(secondLetter)){
                int positionValue = secondLetter - 96;
                sum += positionValue;
            }
            totalSum += sum;
        }
        System.out.printf("%.2f", totalSum);
    }
}
