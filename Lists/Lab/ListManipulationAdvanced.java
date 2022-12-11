package Lists.Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while(!command.equals("end")){
            String[] commandArray = command.split(" ");

            if (command.contains("Contains")) {
                int number = Integer.parseInt(commandArray[1]);
                if (numbersList.contains(number)) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No such number");
                }
            } else if (command.contains("Print even")) {
                getEvenNumbers(numbersList);
            } else if (command.contains("Print odd")) {
                getOddNumbers(numbersList);
            } else if (command.contains("Get sum")) {
                getSum(numbersList);
            } else if (command.contains("Filter")) {
                String filterSign = commandArray[1];
                int compareNumber = Integer.parseInt(commandArray[2]);
                getFilteredNumbers(numbersList, filterSign, compareNumber);
            }
            command = scanner.nextLine();
        }
    }
    public static void getFilteredNumbers (List<Integer> numbersList, String command, int number){

        switch (command){
            case "<":
                String lessThan = "";
                for (int i = 0; i < numbersList.size(); i++) {
                    int currentNum = numbersList.get(i);
                    if (currentNum < number){
                        lessThan += currentNum + " ";
                    }
                }
                System.out.println(lessThan);
                break;
            case ">":
                String moreThan = "";
                for (int i = 0; i < numbersList.size(); i++) {
                    int currentNum = numbersList.get(i);
                    if (currentNum > number){
                        moreThan += currentNum + " ";
                    }
                }
                System.out.println(moreThan);
                break;
            case ">=":
                String moreOrEqual = "";
                for (int i = 0; i < numbersList.size(); i++) {
                    int currentNum = numbersList.get(i);
                    if (currentNum >= number){
                        moreOrEqual += currentNum + " ";
                    }
                }
                System.out.println(moreOrEqual);
                break;
            case "<=":
                String lessOrEqual = "";
                for (int i = 0; i < numbersList.size(); i++) {
                    int currentNum = numbersList.get(i);
                    if (currentNum <= number){
                        lessOrEqual += currentNum + " ";
                    }
                }
                System.out.println(lessOrEqual);
                break;
        }
    }
    public static void getSum(List<Integer> numbersList) {
        int sum = 0;

        for (int i = 0; i < numbersList.size(); i++) {
            sum += numbersList.get(i);
        }
        System.out.println(sum);
    }
    public static void getEvenNumbers(List<Integer> numbersList) {
        List <Integer> evenNumbersList = new ArrayList<>();

        for (int i = 0; i < numbersList.size(); i++) {
            if (numbersList.get(i) % 2 == 0){
                evenNumbersList.add(numbersList.get(i));
            }
        }
        for (int number : evenNumbersList){
            System.out.print(number + " ");
        }
            System.out.println();
    }
    public static void getOddNumbers(List<Integer> numbersList) {
        List <Integer> evenNumbersList = new ArrayList<>();

        for (int i = 0; i < numbersList.size(); i++) {
            if (numbersList.get(i) % 2 != 0){
                evenNumbersList.add(numbersList.get(i));
            }
        }
        for (int number : evenNumbersList){
            System.out.print(number + " ");
        }
            System.out.println();
    }
}
