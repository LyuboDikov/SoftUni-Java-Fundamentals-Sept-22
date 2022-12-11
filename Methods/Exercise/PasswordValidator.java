package Methods.Exercise;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String passInput = scanner.nextLine();

        if (!isBetween6And10Characters(passInput)){
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!isConsistOnlyLettersAndDigits(passInput)){
            System.out.println("Password must consist only of letters and digits");
        }
        if (!isWithAtLeast2Digits(passInput)){
            System.out.println("Password must have at least 2 digits");
        }

        if (isBetween6And10Characters(passInput) && isConsistOnlyLettersAndDigits(passInput) && isWithAtLeast2Digits(passInput)) {
            System.out.println("Password is valid");
        }
    }

    public static boolean isBetween6And10Characters(String text) {

        return text.length() >= 6 && text.length() <= 10;
    }

    public static boolean isConsistOnlyLettersAndDigits(String text) {

        for (char symbol : text.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol)){
                return false;
            }
        }
        return true;
    }

    public static boolean isWithAtLeast2Digits(String text) {

        int digitCounter = 0;
        for (char symbol : text.toCharArray()) {
            if (Character.isDigit(symbol)){
                digitCounter++;
            }
        }
        return digitCounter >= 2;
    }
}

