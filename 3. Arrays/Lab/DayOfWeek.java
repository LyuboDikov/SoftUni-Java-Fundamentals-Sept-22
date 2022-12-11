package Arrays.Lab;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] daysArr = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        int input = Integer.parseInt(scanner.nextLine());

        if (input >= 1 && input <= 7){
            System.out.println(daysArr[input - 1]);
        } else {
            System.out.println("Invalid day!");
        }
    }
}
