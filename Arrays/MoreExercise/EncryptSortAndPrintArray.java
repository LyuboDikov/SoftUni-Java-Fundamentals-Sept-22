package Arrays.MoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int names = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int[] letterSum = new int[names];

        for (int i = 0; i < names ; i++) {
            String name = scanner.nextLine();
            sum = 0;

            for (int j = 0; j < name.length(); j++) {
                char currentChar = name.charAt(j);

                if ( currentChar == 'a' || currentChar == 'A' || currentChar == 'e' || currentChar == 'E' || currentChar == 'i' || currentChar == 'I' ||
                     currentChar == 'o' || currentChar == 'O' || currentChar == 'u' || currentChar == 'U' ){
                    sum += (name.charAt(j) * name.length());
                } else {
                    sum+= (name.charAt(j) / name.length());
                }
            }
            letterSum[i] = sum;
        }
        Arrays.sort(letterSum);
        for (int letter = 0; letter <= letterSum.length - 1; letter++) {
            System.out.println(letterSum[letter]);
        }
    }
}