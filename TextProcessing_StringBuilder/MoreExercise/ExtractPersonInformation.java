package TextProcessing_StringBuilder.MoreExercise;

import java.util.Scanner;

public class ExtractPersonInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= count; i++) {
            String input = scanner.nextLine();

            StringBuilder name = new StringBuilder();
            StringBuilder age = new StringBuilder();


            int nameStart = input.indexOf("@");
            int nameEnd = input.indexOf("|");
            for (int k = nameStart + 1; k < nameEnd; k++) {
                char symbol = input.charAt(k);
                name.append(symbol);
            }

            int ageStart = input.indexOf("#");
            int ageEnd = input.indexOf("*");

            for (int k = ageStart + 1; k < ageEnd; k++) {
                char symbol = input.charAt(k);
                age.append(symbol);
            }

            System.out.printf("%s is %d years old.\n", name, Integer.parseInt(age.toString()));
        }
    }
}
