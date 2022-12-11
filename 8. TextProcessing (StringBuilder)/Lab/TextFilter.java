package TextProcessing_StringBuilder.Lab;

import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] banWord = scanner.nextLine().split(", ");

        String text = scanner.nextLine();

        for (String word : banWord){
            text = text.replaceAll(word, repeatString("*", word.length()));
        }
        System.out.println(text);
    }
    public static String repeatString (String s, int count){
        StringBuilder resultSB = new StringBuilder();
        for (int i = 0; i < count; i++) {
            resultSB.append(s);
        }
        return resultSB.toString();
    }
}
