package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //water tank -> 255 liters капацитет
        //прочитаме:
        //1. Колко пъти ще наливаме вода.
        // продължаваме докато пътите, в които наливаме вода приключат - for loop;
        //2. прочитане на литри вода, които наливаме в tank-a;
        // 3. Изваждаме налетите литри от общия капацитет, за да намерим колко капацитет ни остава.
        // Ако литрите, които наливаме > от останалия капацитет, изпечатваме "Insufficient capacity!"
        // и продължаваме да четем следващите литри

        int capacity = 255;
        int waterPours = Integer.parseInt(scanner.nextLine());
        int totalLiters = 0;
        for (int pour = 1; pour <= waterPours ; pour++) {
            int liters = Integer.parseInt(scanner.nextLine());
            if (liters > capacity){
                System.out.println("Insufficient capacity!");
                continue;
            }
            capacity -= liters;
            totalLiters += liters;
        }
        System.out.println(totalLiters);
    }
}
