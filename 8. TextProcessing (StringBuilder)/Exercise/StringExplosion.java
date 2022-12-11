package TextProcessing_StringBuilder.Exercise;

import java.util.Scanner;

public class StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StringBuilder textSB = new StringBuilder(input);

        int totalBangPower = 0;

        for (int i = 0; i <= textSB.length() - 1 ; i++) {
            char currentSymbol = textSB.charAt(i);

            if (currentSymbol == '>'){
                int bangPower = Integer.parseInt(String.valueOf(textSB.charAt(i + 1)));
                totalBangPower += bangPower;
            } else if (currentSymbol != '>' && totalBangPower > 0){
                textSB.deleteCharAt(i);
                totalBangPower--;
                i--;
            }
        }
        System.out.println(textSB);
    }
}
