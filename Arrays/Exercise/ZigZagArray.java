package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ZigZagArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String [] firstArray = new String[n];
        String [] secondArray = new String[n];

        //Ако имаме четен ред -> firstNumber отива в secondArray, а secondNumber отива в firstArray;
        //Ако имаме нечетен ред -> firstNumber отива в firstArray, а secondNumber отива в secondArray;

        for (int i = 1; i <= n; i++) {
            String[] input = scanner.nextLine().split(" ");
            String firstNumber = input[0];
            String secondNumber = input[1];
            if (i % 2 == 0){
                secondArray[i - 1] = firstNumber;
                firstArray[i - 1] = secondNumber;
            } else{
                secondArray[i - 1] = secondNumber;
                firstArray[i - 1] = firstNumber;
            }
        }
        System.out.println(String.join(" ", firstArray));
        System.out.println(String.join(" ", secondArray));
    }
}
