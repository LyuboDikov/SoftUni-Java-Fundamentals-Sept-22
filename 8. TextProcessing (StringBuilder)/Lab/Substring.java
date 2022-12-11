package TextProcessing_StringBuilder.Lab;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String wordToRemove = scanner.nextLine();
        String text = scanner.nextLine();

        //int indexToRemove = text.indexOf(wordToRemove);

        while (text.contains(wordToRemove)) {

            text = text.replace(wordToRemove, "");
            //indexToRemove = text.indexOf(wordToRemove);
        }
        System.out.println(text);
    }
}

