package TextProcessing_StringBuilder.Lab;

import java.util.Scanner;

public class DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StringBuilder letterSB = new StringBuilder();
        StringBuilder digitSB = new StringBuilder();
        StringBuilder otherSB = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char currentSymbol = input.charAt(i);

            if (Character.isDigit(currentSymbol)){
                digitSB.append(currentSymbol);
            } else if (Character.isLetter(currentSymbol)){
                letterSB.append(currentSymbol);
            } else {
                otherSB.append(currentSymbol);
            }
        }
        System.out.println(digitSB);
        System.out.println(letterSB);
        System.out.println(otherSB);
    }
}
