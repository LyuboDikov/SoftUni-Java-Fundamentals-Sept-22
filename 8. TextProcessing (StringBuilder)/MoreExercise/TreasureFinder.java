package TextProcessing_StringBuilder.MoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class TreasureFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] keyInput = scanner.nextLine().split(" ");
        StringBuilder key = new StringBuilder();
        for (String currentKey : keyInput) {
            key.append(currentKey);
        }

        String input = scanner.nextLine();


        while (!input.equals("find")) {
            StringBuilder textSB = new StringBuilder(input);
            StringBuilder treasure = new StringBuilder();
            StringBuilder coordinates = new StringBuilder();
            StringBuilder encryptedText = new StringBuilder();

            for (int i = 0; i < textSB.length(); i++) {

                for (int keyPos = 0; keyPos < key.length(); keyPos++) {
                    if (keyPos == textSB.length()) {
                        break;
                    }
                    int keyNumber = Integer.parseInt(String.valueOf(key.charAt(keyPos)));
                    char symbol = textSB.charAt(keyPos);
                    char symbolToAdd = (char) (symbol - keyNumber);
                    encryptedText.append(symbolToAdd);
                }
                textSB.delete(0, key.length());
                i = -1;
            }

            treasure.append(encryptedText.substring(encryptedText.indexOf("&") + 1, encryptedText.lastIndexOf("&")));
            coordinates.append(encryptedText.substring(encryptedText.indexOf("<") + 1, encryptedText.indexOf(">")));
            System.out.printf("Found %s at %s\n", treasure, coordinates);
            input = scanner.nextLine();
        }
    }
}
