package Methods.Exercise;

import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstSymbol = scanner.nextLine().charAt(0);
        char secondSymbol = scanner.nextLine().charAt(0);

        getInBetweenChars(firstSymbol, secondSymbol);
    }

    public static void getInBetweenChars(char start, char end) {

        if (start < end) {
            for (char symbol = (char) (start + 1); symbol < end; symbol++) {
                System.out.print( symbol + " ");
            }
        } else {
            for (char symbol = (char) (end + 1); symbol < start; symbol++) {
                System.out.print(symbol + " ");
            }
        }
    }
}


