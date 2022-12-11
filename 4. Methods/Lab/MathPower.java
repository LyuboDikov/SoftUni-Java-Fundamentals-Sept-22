package Methods.Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double input = Double.parseDouble(scanner.nextLine());
        int powerNum = Integer.parseInt(scanner.nextLine());

        System.out.println(new DecimalFormat("0.####").format(getResult(input, powerNum)));

    }
    public static double getResult(double num, int powerNum){
        double result = Math.pow(num, powerNum);
        return result;
    }
}

