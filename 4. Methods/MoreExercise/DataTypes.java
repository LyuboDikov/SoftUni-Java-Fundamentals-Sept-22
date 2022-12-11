package Methods.MoreExercise;

import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputType = scanner.nextLine();

        switch (inputType){
            case "int":
                getResult(Integer.parseInt(scanner.nextLine()));
                break;
            case "real":
                getResult(Double.parseDouble(scanner.nextLine()));
                break;
            case "string":
                getResult(scanner.nextLine());
                break;
        }
    }

    public static void getResult(int number) {

        int result = number * 2;
        System.out.println(result);
    }

    public static void getResult(double number) {

        double result = number * 1.5;
        System.out.printf("%.2f", result);
    }

    public static void getResult(String text) {

        String[] newTextArray = new String[text.length() + 2];
        String[] textArray = text.split("");
        newTextArray[0] = "$";
        newTextArray[newTextArray.length - 1] = "$";
        for (int i = 1; i <= newTextArray.length - 2 ; i++) {
            newTextArray[i] = textArray[i - 1];
        }
        String newString = String.join("", newTextArray);
        System.out.println(newString);
    }
}
