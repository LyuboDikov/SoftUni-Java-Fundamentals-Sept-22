package TextProcessing_StringBuilder.Lab;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            StringBuilder reverseSB = new StringBuilder();
            String currentWord = input;

            for (int i = input.length() - 1; i >= 0; i--) {
                reverseSB.append(input.charAt(i));
            }

            input = scanner.nextLine();

            System.out.printf("%s = %s\n", currentWord, reverseSB);
        }
    }
}
