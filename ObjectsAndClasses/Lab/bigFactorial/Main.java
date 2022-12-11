package ObjectsAndClasses.Lab.bigFactorial;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        BigInteger sum = new BigInteger("1");
        for (int i = 1; i <= number ; i++) {
            sum = sum.multiply(BigInteger.valueOf(i));
        }
        System.out.println(sum);
    }
}
