package BasicSyntaxCondStatementsandLoops.Lab;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int integer = Integer.parseInt(scanner.nextLine());
        int multiplier = Integer.parseInt(scanner.nextLine());

        if (multiplier <= 10) {
            for (int i = multiplier; i <= 10; i++) {
                System.out.printf("%d X %d = %d\n", integer, i, integer * i);
            }
        } else {
            System.out.printf("%d X %d = %d", integer, multiplier, integer * multiplier);
        }
    }
}