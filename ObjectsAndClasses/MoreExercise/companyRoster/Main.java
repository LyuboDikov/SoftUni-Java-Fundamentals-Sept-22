package ObjectsAndClasses.MoreExercise.companyRoster;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n ; i++) {

            String input = scanner.nextLine();

            String[] inputData = input.split(" ");

            String name = inputData[0];
            double salary = Double.parseDouble(inputData[1]);
            String position = inputData[2];
            String department = inputData[3];
            String email = inputData[4];
            int age = Integer.parseInt(inputData[5]);


        }
    }
}
