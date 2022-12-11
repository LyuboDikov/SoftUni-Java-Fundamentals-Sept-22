package BasicSyntaxCondStatementsandLoops.Exercise;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ordersCount = Integer.parseInt(scanner.nextLine());
        double price = 0;
        double totalPrice = 0;
        for (int i = 1; i <= ordersCount ; i++) {
            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int daysInMonth = Integer.parseInt(scanner.nextLine());
            int capsules = Integer.parseInt(scanner.nextLine());
            price = (daysInMonth * capsules) * pricePerCapsule;
            System.out.printf("The price for the coffee is: $%.2f\n", price);
            totalPrice += price;
        }
        System.out.printf("Total: $%.2f", totalPrice);
    }
}
