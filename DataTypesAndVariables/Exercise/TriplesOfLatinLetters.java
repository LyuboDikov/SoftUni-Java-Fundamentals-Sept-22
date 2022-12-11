package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 'a'; i < 'a' + number; i++) {
            for (int j = 'a'; j < 'a' + number ; j++) {
                for (int k = 'a'; k < 'a' + number ; k++) {
                    System.out.printf("%c%c%c\n", i, j, k);
                }
            }
        }
    }
}
