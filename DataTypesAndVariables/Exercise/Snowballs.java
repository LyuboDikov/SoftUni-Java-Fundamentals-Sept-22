package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int snowballsCount = Integer.parseInt(scanner.nextLine());
        double bestValue = Double.MIN_VALUE;

        int snowballSnowBest = 0;
        int snowballTimeBest = 0;
        int snowballQualityBest = 0;
        for (int snowball = 1; snowball <= snowballsCount; snowball++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

            double snowballValue = Math.pow((snowballSnow / (snowballTime * 1.0)), snowballQuality);
            if (snowballValue > bestValue) {
                bestValue = snowballValue;
                snowballQualityBest = snowballQuality;
                snowballSnowBest = snowballSnow;
                snowballTimeBest = snowballTime;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)", snowballSnowBest, snowballTimeBest, bestValue, snowballQualityBest);
    }
}
