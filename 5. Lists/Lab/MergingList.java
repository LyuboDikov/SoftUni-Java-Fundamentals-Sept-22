package Lists.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MergingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> firstList = new ArrayList<>(List.of(scanner.nextLine().split(" ")));
        List<String> secondList = new ArrayList<>(List.of(scanner.nextLine().split(" ")));

        List<String> mergedList = new ArrayList<>();

        while (firstList.size() > 0 && secondList.size() > 0) {
            int i = 0;
            mergedList.add(firstList.get(i));
            mergedList.add(secondList.get(i));
            firstList.remove(i);
            secondList.remove(i);
        }
        mergedList.addAll(firstList);
        mergedList.addAll(secondList);

        for (String number : mergedList){
            System.out.print(number + " ");
        }
    }
}

