package DataTypesAndVariables.MoreExercises;

import java.util.Scanner;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());
        int counterOpen = 0;
        int counterClosed = 0;
        int startOpen = 0;
        int startClosed = 0;

        boolean isBalanced = true;

        for (int line = 1; line <= lines; line++) {
            String text = scanner.nextLine();

            if (text.equals("(")) {
                counterOpen++;
                counterClosed = 0;
                startOpen++;
            } else if (text.equals(")")) {
                counterOpen = 0;
                counterClosed++;
                startClosed++;
            }
            //Ако имаме две последователни отварящи, или затварящи скоби:
            if (counterOpen > 1 || counterClosed > 1) {
                isBalanced = false;
                break;
            }
            //Ако има случай, в който затварящата скоба е преди отварящата:
            if (startClosed > startOpen) {
                isBalanced = false;
                break;
            }
        }
        // Ако има отваряща скоба, но не последва никаква затваряща:
        if (startClosed != startOpen){
            isBalanced = false;
        }
        if (isBalanced){
            System.out.println("BALANCED");
        } else {
            System.out.println("UNBALANCED");
        }
    }
}