package TextProcessing_StringBuilder.MoreExercise;

import java.util.Scanner;

public class AsciiSumator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstChar = scanner.nextLine().charAt(0);
        char secondChar = scanner.nextLine().charAt(0);
        String text = scanner.nextLine();
        int sum = 0;

        for (int i = 0; i < text.length(); i++) {

            char symbol = text.charAt(i);

            if (symbol > (int) firstChar && symbol < (int) secondChar) {
                sum += symbol;
            }
        }
        System.out.println(sum);
    }
}
