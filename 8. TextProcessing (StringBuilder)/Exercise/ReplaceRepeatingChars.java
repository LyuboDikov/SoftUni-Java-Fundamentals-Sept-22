package TextProcessing_StringBuilder.Exercise;

import java.util.Scanner;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        StringBuilder textSB = new StringBuilder();
        textSB.append(text);
        // aaaaabbbbbcdddeeeedssaa

        for (int i = 0; i < textSB.length() - 1; i++) {
            if (textSB.charAt(i) == textSB.charAt(i + 1)){
                textSB.deleteCharAt(i + 1);
                i--;
            }
        }
        System.out.println(textSB);
    }
}