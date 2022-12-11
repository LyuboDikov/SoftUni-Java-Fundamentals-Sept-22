package BasicSyntaxCondStatementsandLoops.Exercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleCount = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String day = scanner.nextLine();

        double pricePerDay = 0;
        double totalPrice = 0;

        switch (day){
            case "Friday":
                switch (type){
                    case "Students":
                        pricePerDay = 8.45;
                        totalPrice = pricePerDay * peopleCount;
                        break;
                    case "Business":
                        pricePerDay = 10.90;
                        totalPrice = pricePerDay * peopleCount;
                        break;
                    case "Regular":
                        pricePerDay = 15;
                        totalPrice = pricePerDay * peopleCount;
                        break;
                }
                break;
            case "Saturday":
                switch (type){
                    case "Students":
                        pricePerDay = 9.80;
                        totalPrice = pricePerDay * peopleCount;
                        break;
                    case "Business":
                        pricePerDay = 15.60;
                        totalPrice = pricePerDay * peopleCount;
                        break;
                    case "Regular":
                        pricePerDay = 20;
                        totalPrice = pricePerDay * peopleCount;
                        break;
                }
                break;
            case "Sunday":
                switch (type){
                    case "Students":
                        pricePerDay = 10.46;
                        totalPrice = pricePerDay * peopleCount;
                        break;
                    case "Business":
                        pricePerDay = 16;
                        totalPrice = pricePerDay * peopleCount;
                        break;
                    case "Regular":
                        pricePerDay = 22.50;
                        totalPrice = pricePerDay * peopleCount;
                        break;
                }
                break;
        }
        switch (type){
            case "Students":
                if (peopleCount >= 30){
                    totalPrice = totalPrice - totalPrice * 0.15;
                }
                break;
            case "Business":
                if (peopleCount >= 100){
                    totalPrice = totalPrice - 10 * pricePerDay;
                }
                break;
            case "Regular":
                if (peopleCount >= 10 && peopleCount <= 20){
                    totalPrice = totalPrice - totalPrice * 0.05;
                }
                break;
        }
        System.out.printf("Total price: %.2f", totalPrice);
    }
}
