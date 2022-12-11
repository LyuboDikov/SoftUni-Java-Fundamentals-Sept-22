package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rotations = Integer.parseInt(scanner.nextLine());

        //Трябва да запазим първия символ на мястото на последния,
        // а всички останали символи да се преместят с 1 наляво.

        for (int rotation = 1; rotation <= rotations; rotation++) {
        int firstElement = numArray[0];
            for (int index = 0; index < numArray.length - 1; index++) {
                numArray[index] = numArray[index + 1];
            }
            numArray[numArray.length - 1] = firstElement;
        }
        for (int number :numArray) {
            System.out.print(number + " ");
        }
    }
}
