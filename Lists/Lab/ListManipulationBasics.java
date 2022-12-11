package Lists.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while(!command.equals("end")){
            String[] commandArray = command.split(" ");

            switch (commandArray[0]){
                case "Add":
                    int number = Integer.parseInt(commandArray[1]);
                    numbersList.add(number);
                    break;
                case "Remove":
                    int value = Integer.parseInt(commandArray[1]);
                    numbersList.remove(Integer.valueOf(value));
                    break;
                case "RemoveAt":
                    int index = Integer.parseInt(commandArray[1]);
                    numbersList.remove(index);
                    break;
                case "Insert":
                    int insertNumber = Integer.parseInt(commandArray[1]);
                    int insertIndex = Integer.parseInt(commandArray[2]);
                    numbersList.add(insertIndex, insertNumber);
                    break;
            }
            command = scanner.nextLine();
        }
        for (int element : numbersList){
            System.out.print(element + " ");
        }
    }
}
