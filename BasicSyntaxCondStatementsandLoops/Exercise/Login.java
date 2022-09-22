package BasicSyntaxCondStatementsandLoops.Exercise;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();

        String correctPassword = "";

        for (int position = username.length() - 1; position >= 0; position--) {
            char currentSymbol = username.charAt(position);
            correctPassword += currentSymbol;
        }
        String enteredPassword = scanner.nextLine();
        int counter = 0;

        while (!enteredPassword.equals(correctPassword)) {
            counter++;
            if (counter == 4) {
                System.out.printf("User %s blocked!", username);
                break;
            }
            System.out.println("Incorrect password. Try again.");
            enteredPassword = scanner.nextLine();
        }
        if (enteredPassword.equals(correctPassword)) {
            System.out.printf("User %s logged in.", username);
        }
    }
}