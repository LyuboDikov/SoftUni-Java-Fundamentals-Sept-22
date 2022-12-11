package ObjectsAndClasses.Lab.randomizeWords;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] wordsArray = input.split("\\s+");

        Random rnd = new Random();

        for (int i = 0; i < wordsArray.length; i++) {
            int index1 = rnd.nextInt(wordsArray.length);
            int index2 = rnd.nextInt(wordsArray.length);

            String oldWord = wordsArray[index1];

            wordsArray[index1] = wordsArray[index2];
            wordsArray[index2] = oldWord;
        }
        for (String word : wordsArray) {
            System.out.println(word);
        }
    }
}
