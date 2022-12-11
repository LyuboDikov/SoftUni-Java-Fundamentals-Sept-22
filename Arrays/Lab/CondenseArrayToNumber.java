package Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int[] condensed = new int[numbersArray.length - 1];
        for (int i = 0; i < numbersArray.length; i++) {
            if (numbersArray.length == 1){
                break;
            }

            if (i == numbersArray.length - 1){
                int[] condensedNew = new int[condensed.length - 1];
                i = -1;
                numbersArray = condensed;
                condensed = condensedNew;
            } else {

            condensed[i] = numbersArray[i] + numbersArray[i + 1];
            }
        }
        System.out.println(numbersArray[0]);
    }
}
