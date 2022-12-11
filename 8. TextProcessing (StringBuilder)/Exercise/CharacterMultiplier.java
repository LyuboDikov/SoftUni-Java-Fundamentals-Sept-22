package TextProcessing_StringBuilder.Exercise;

import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String firstString = input.split("\\s+")[0];
        String secondString = input.split("\\s+")[1];

        getResult(firstString, secondString);
    }

    public static void getResult(String first, String second) {

        //Променлива, в която запазваме резултата от умножението на символите.
        double result = 0;

        StringBuilder firstSB = new StringBuilder();
        firstSB.append(first);

        StringBuilder secondSB = new StringBuilder();
        secondSB.append(second);

        while (firstSB.length() > 0 && secondSB.length() > 0) {
            char firstSymbol = firstSB.charAt(0);
            char secondSymbol = secondSB.charAt(0);

            result += firstSymbol * secondSymbol;

            firstSB.deleteCharAt(0);
            secondSB.deleteCharAt(0);

        }
        if (firstSB.length() == 0) {
            for (int i = 0; i < secondSB.length(); i++) {
                char symbol = secondSB.charAt(i);
                result += symbol;
            }
        } else if (secondSB.length() == 0) {
            for (int i = 0; i < firstSB.length(); i++) {
                char symbol = firstSB.charAt(i);
                result += symbol;
            }
        }
        System.out.printf("%.0f", result);
    }
}
