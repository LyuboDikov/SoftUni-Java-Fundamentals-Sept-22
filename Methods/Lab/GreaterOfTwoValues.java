package Methods.Lab;

import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        switch (input) {
            case "int":
                int firstNum = Integer.parseInt(scanner.nextLine());
                int secondNum = Integer.parseInt(scanner.nextLine());
                System.out.println(getMax(firstNum, secondNum));
                break;
            case "char":
                char firstSymbol = scanner.nextLine().charAt(0);
                char secondSymbol = scanner.nextLine().charAt(0);
                System.out.println(getMax(firstSymbol, secondSymbol));
                break;
            case "string":
                String text1 = scanner.nextLine();
                String text2 = scanner.nextLine();
                System.out.println(getMax(text1, text2));
                break;
        }
    }

    public static int getMax(int firstNum, int secondNum) {
        int max = Math.max(firstNum, secondNum);

        return max;
    }

    public static char getMax(char first, char second) {
        if (first > second) {
            return first;
        }
        return second;
    }

     public static String getMax(String firstText, String secondText) {
        if (firstText.compareTo(secondText) >= 0) {
            return firstText;
        }
        return secondText;
    }
}
