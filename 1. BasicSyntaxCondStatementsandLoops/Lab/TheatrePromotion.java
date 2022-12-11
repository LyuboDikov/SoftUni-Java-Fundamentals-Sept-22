package BasicSyntaxCondStatementsandLoops.Lab;

import java.util.Scanner;

public class TheatrePromotion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String day = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        int price = 0;

        if (age < 0){
            System.out.println("Error!");
        } else if (age <= 18) {
            switch (day) {
                case "Weekday":
                    price = 12;
                    break;
                case "Weekend":
                    price = 15;
                    break;
                case "Holiday":
                    price = 5;
                    break;
                default:
                    System.out.println("Error!");
            }
            System.out.printf("%d$", price);
        } else if (age <= 64) {
            switch (day) {
                case "Weekday":
                    price = 18;
                    break;
                case "Weekend":
                    price = 20;
                    break;
                case "Holiday":
                    price = 12;
                    break;
                default:
                    System.out.println("Error!");
            }
            System.out.printf("%d$", price);
        } else if (age <= 122){
            switch (day) {
                case "Weekday":
                    price = 12;
                    break;
                case "Weekend":
                    price = 15;
                    break;
                case "Holiday":
                    price = 10;
                    break;
                default:
                    System.out.println("Error!");
            }
            System.out.printf("%d$", price);
        } else {
            System.out.println("Error!");
        }
    }
}