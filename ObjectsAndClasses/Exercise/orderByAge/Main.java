package ObjectsAndClasses.Exercise.orderByAge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> personList = new ArrayList<>();

        String input = scanner.nextLine();

        while (!input.equals("End")){

            String[] inputData = input.split(" ");

            String name = inputData[0];
            String id = inputData[1];
            int age = Integer.parseInt(inputData[2]);

            Person person = new Person(name, id, age);
            personList.add(person);

            input = scanner.nextLine();
        }
        personList.sort(Comparator.comparing(Person::getAge));

        for (Person person : personList){
            System.out.println(person);
        }
    }
}
