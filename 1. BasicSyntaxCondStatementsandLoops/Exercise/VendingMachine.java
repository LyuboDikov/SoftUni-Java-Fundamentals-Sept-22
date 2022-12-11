package BasicSyntaxCondStatementsandLoops.Exercise;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String insert = scanner.nextLine();
        double insertedCoinsSum = 0;
        double productPrice = 0;

        while (!insert.equals("Start")) {
            double insertedCoin = Double.parseDouble(insert);

            if (insertedCoin != 0.1 && insertedCoin != 0.2 && insertedCoin != 0.5 && insertedCoin != 1 && insertedCoin != 2) {
                System.out.printf("Cannot accept %.2f\n", insertedCoin);
            } else {
                insertedCoinsSum += insertedCoin;
            }

            insert = scanner.nextLine();
        }

        String product = scanner.nextLine();
        while (!product.equals("End")){
            switch (product){
                case "Nuts":
                    productPrice = 2;
                    if (productPrice > insertedCoinsSum){
                        System.out.println("Sorry, not enough money");
                        break;
                    }
                    System.out.printf("Purchased %s\n", product);
                    insertedCoinsSum -= productPrice;
                    break;
                case "Water":
                    productPrice = 0.7;
                    if (productPrice > insertedCoinsSum){
                        System.out.println("Sorry, not enough money");
                        break;
                    }
                    System.out.printf("Purchased %s\n", product);
                    insertedCoinsSum -= productPrice;
                    break;
                case "Crisps":
                    productPrice = 1.5;
                    if (productPrice > insertedCoinsSum){
                        System.out.println("Sorry, not enough money");
                        break;
                    }
                    System.out.printf("Purchased %s\n", product);
                    insertedCoinsSum -= productPrice;
                    break;
                case "Soda":
                    productPrice = 0.8;
                    if (productPrice > insertedCoinsSum){
                        System.out.println("Sorry, not enough money");
                        break;
                    }
                    System.out.printf("Purchased %s\n", product);
                    insertedCoinsSum -= productPrice;
                    break;
                case "Coke":
                    productPrice = 1;
                    if (productPrice > insertedCoinsSum){
                        System.out.println("Sorry, not enough money");
                        break;
                    }
                    System.out.printf("Purchased %s\n", product);
                    insertedCoinsSum -= productPrice;
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }
            product = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", insertedCoinsSum);
    }
}
