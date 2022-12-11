package Methods.Lab;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());

        System.out.println(getRepeatedText(input, n));

    }
    public static String getRepeatedText(String text, int repetition){
        String result = "";
        for (int i = 1; i <= repetition ; i++) {
            result += text;
        }
            return result;
    }
}
