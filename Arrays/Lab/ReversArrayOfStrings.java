package Arrays.Lab;

import java.util.Scanner;

public class ReversArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] symbolsArray = scanner.nextLine().split(" ");

        for (int i = 0; i < symbolsArray.length / 2 ; i++) {
            String firstElement = symbolsArray[i];
            symbolsArray[i] = symbolsArray[symbolsArray.length - 1 - i];
            symbolsArray[symbolsArray.length - 1 - i] = firstElement;
        }
        System.out.println(String.join(" ", symbolsArray));
    }
}
