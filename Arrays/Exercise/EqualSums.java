package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            boolean isEqual = false;
            int correctIndex = 0;
        for (int index = 0; index <= numbersArray.length - 1; index++) {

            int leftSum = 0;
            int rightSum = 0;
            for (int i = index + 1; i <= numbersArray.length - 1 ; i++) {
                rightSum += numbersArray[i];
            }
            for (int j = index - 1; j >= 0 ; j--) {
                leftSum += numbersArray[j];
            }
            if (rightSum == leftSum){
                correctIndex = index;
                isEqual = true;
                break;
            }
        }
        if (isEqual){
            System.out.println(correctIndex);
        } else {
            System.out.println("no");
        }
    }
}
