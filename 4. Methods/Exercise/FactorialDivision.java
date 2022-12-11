package Methods.Exercise;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long number1 = Integer.parseInt(scanner.nextLine());
        long number2 = Integer.parseInt(scanner.nextLine());

        long fact1 = getFactorial(number1);
        long fact2 = getFactorial(number2);

        double result = fact1 * 1.0 / fact2;
        System.out.printf("%.2f", result);
    }

    public static long getFactorial (long number){

        long factorial = 1;

        for (int i = 1; i <= number ; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
