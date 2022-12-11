package Lists.Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<String> newNumbersList = new ArrayList<>();

        for (int i = 0; i < numbersList.size(); i++) {
            if (i == numbersList.size() - 1){
                newNumbersList.add(newNumbersList.size(), String.valueOf(numbersList.get(i)));
                break;
            }
            int firstNum = numbersList.get(i);
            int secondNum = numbersList.get(numbersList.size() - 1);
            int result = firstNum + secondNum;
            newNumbersList.add(String.valueOf(result));
            numbersList.remove(numbersList.size() - 1);
        }
        for (String number : newNumbersList){
            System.out.print(number + " ");
        }
    }
}
