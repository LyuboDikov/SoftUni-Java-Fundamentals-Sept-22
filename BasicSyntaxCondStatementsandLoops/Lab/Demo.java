package BasicSyntaxCondStatementsandLoobs.Lab;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        String name = scanner.nextLine();

        System.out.printf("%s is %d years old.", name, age);
    }
}

