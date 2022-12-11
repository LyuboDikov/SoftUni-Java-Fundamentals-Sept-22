package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int number = Integer.parseInt(scanner.nextLine());

        for (int index = 0; index < array.length; index++) {
            int firstNum = array[index];

            for (int index2 = index + 1; index2 < array.length; index2++) {
                int secondNum = array[index2];

                if (firstNum + secondNum == number) {
                    System.out.printf("%d %d\n", firstNum, secondNum);
                }
            }
        }
    }
}

