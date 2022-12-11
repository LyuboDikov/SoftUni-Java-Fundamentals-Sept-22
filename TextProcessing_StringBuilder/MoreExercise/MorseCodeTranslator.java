package TextProcessing_StringBuilder.MoreExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MorseCodeTranslator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] english = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
                "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x",
                "y", "z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0",
                ",", ".", "?" };

        String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
                ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.",
                "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
                "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
                "-----", "--..--", ".-.-.-", "..--.." };

        String input = scanner.nextLine();

        List<String> inputList = Arrays.stream(input.split(" ")).collect(Collectors.toList());
        StringBuilder englishText = new StringBuilder();

        for (int i = 0; i < inputList.size(); i++) {
            String currentLetter = inputList.get(i);
            if (currentLetter.equals("|")){
                englishText.append(currentLetter);
            } else {
                for (int j = 0; j < morse.length; j++) {
                    if (currentLetter.equals(morse[j])) {
                        englishText.append(english[j]);
                        break;
                    }
                }
            }
        }

        String finalText = englishText.toString().replaceAll("\\|", " ");

        System.out.println(finalText.toUpperCase());
    }
}
