package Arrays.MoreExercise;

import java.util.Scanner;

public class MultiplicationSign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        if (num1 == 0 || num2 == 0 || num3 == 0){
            System.out.println("zero");
        } else {
            if (isPositive(num1, num2, num3)){
                System.out.println("positive");
            } else {
                System.out.println("negative");
            }
        }

    }

    public static boolean isPositive (int num1, int num2, int num3){

        int counter = 0;

        if (num1 < 0){
            counter++;
        }
        if (num2 < 0) {
            counter++;
        }
        if (num3 < 0){
            counter++;
        }

        if (counter == 0 || counter == 2){
            return true;
        } else {
            return false;
        }
    }
}