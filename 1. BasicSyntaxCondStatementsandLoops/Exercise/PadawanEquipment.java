package BasicSyntaxCondStatementsandLoops.Exercise;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double lightSaberPrice = Double.parseDouble(scanner.nextLine());
        double robePrice = Double.parseDouble(scanner.nextLine());
        double beltPrice = Double.parseDouble(scanner.nextLine());
        double lightSabers = Math.ceil(students + (students * 0.10));

        int beltsCount = 0;
        int totalBelts = 0;
        for (int i = 1; i <= students; i++) {
            beltsCount++;
            if (beltsCount == 6) {
                beltsCount = 0;
                continue;
            }
            totalBelts++;
        }
        double totalRobesPrice = students * robePrice;
        double totalLightSabersPrice = lightSaberPrice * lightSabers;
        double totalBeltsPrice = totalBelts * beltPrice;

        double totalSum = totalBeltsPrice + totalLightSabersPrice + totalRobesPrice;
        if (budget >= totalSum){
            System.out.printf("The money is enough - it would cost %.2flv.", totalSum);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", totalSum - budget);
        }
    }
}
