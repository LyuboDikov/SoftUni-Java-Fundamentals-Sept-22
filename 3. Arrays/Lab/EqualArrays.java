package Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] secondArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int sum = 0;
        boolean isIdentical = true;
        int faultIndex = 0;

        for (int i = 0; i < firstArray.length; i++) {
            int firstNum = firstArray[i];
            int secondNum = secondArray[i];
            if (firstNum == secondNum){
                sum += firstNum;
            } else {
                faultIndex = i;
                isIdentical = false;
                break;
            }
        }
        if (isIdentical){
            System.out.printf("Arrays are identical. Sum: %d", sum);
        } else {
            System.out.printf("Arrays are not identical. Found difference at %d index.", faultIndex);
        }
    }
}
