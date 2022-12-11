package Methods.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        System.out.println(getVowelsCount(input));

    }

    public static String getVowelsCount(String word) {

        String[] array = word.split("");

        int vowelsCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals("a") || array[i].equals("A") || array[i].equals("e") || array[i].equals("E") ||
                    array[i].equals("i") || array[i].equals("I") || array[i].equals("o") || array[i].equals("O") ||
                    array[i].equals("u") || array[i].equals("U")) {
                vowelsCount++;
            }
        }
        String vowelsCountString = Integer.toString(vowelsCount);
        return vowelsCountString;
    }
}