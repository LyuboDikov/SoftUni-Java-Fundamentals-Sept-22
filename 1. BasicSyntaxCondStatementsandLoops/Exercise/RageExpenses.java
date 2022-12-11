package BasicSyntaxCondStatementsandLoops.Exercise;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGames = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int gameCount = 0;
        int headsetTrash = 0;
        int mouseTrash = 0;
        int keyboardTrash = 0;
        int displayTrash = 0;
        int keyboardCounter = 0;

        //Every second lost game, Peter trashes his headset.
        //Every third lost game, Peter trashes his mouse.
        //When Peter trashes both his mouse and headset in the same lost game, he also trashes his keyboard.
        //Every second time when he trashes his keyboard, he also trashes his display.

        for (int i = 1; i <= lostGames ; i++) {
            gameCount++;
            if (gameCount % 2 == 0){
                headsetTrash++;
            }
            if (gameCount % 3 == 0){
                mouseTrash++;
            }
            if (gameCount % 2 == 0 && gameCount % 3 == 0){
                keyboardTrash++;
                keyboardCounter++;
            }
            if (keyboardCounter > 0 && keyboardCounter % 2 == 0){
                displayTrash++;
                keyboardCounter = 0;
            }
        }
        double rageExpenses = (headsetTrash * headsetPrice) + (mouseTrash * mousePrice) +
                (keyboardTrash * keyboardPrice) + (displayTrash * displayPrice);
        System.out.printf("Rage expenses: %.2f lv.", rageExpenses);
    }
}
