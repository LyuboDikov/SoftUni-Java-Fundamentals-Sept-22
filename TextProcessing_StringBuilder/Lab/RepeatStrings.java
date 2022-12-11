package TextProcessing_StringBuilder.Lab;

import java.util.Scanner;

public class RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] wordsArr = input.split("\\s+");

        StringBuilder concatText = new StringBuilder();

        for (int i = 0; i < wordsArr.length; i++) {
            String currentWord = wordsArr[i];
            int count = currentWord.length();

            for (int j = 0; j < count; j++) {
                concatText.append(currentWord);
            }
        }
        System.out.println(concatText);
    }
}
