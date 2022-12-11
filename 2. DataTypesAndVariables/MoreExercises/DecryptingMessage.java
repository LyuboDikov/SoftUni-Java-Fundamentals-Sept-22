package DataTypesAndVariables.MoreExercises;

import java.util.Scanner;

public class DecryptingMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int key = Integer.parseInt(scanner.nextLine());
        int lines = Integer.parseInt(scanner.nextLine());
        String message = "";

        for (int line = 1; line <= lines ; line++) {
            char symbol = scanner.next().charAt(0);
            int finalSymbol = key + symbol;
            message += (char) finalSymbol;
        }
        System.out.println(message);
    }
}
