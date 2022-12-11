package Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagonsList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int wagonCapacity = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        while (!input.equals("end")){
        String[] wagonArray = input.split(" ");

        if (input.contains("Add")){
            wagonsList.add(Integer.valueOf(wagonArray[1]));
        } else {
            for (int i = 0; i < wagonsList.size(); i++) {
            int passengersWaiting = Integer.parseInt(wagonArray[0]);
                int currentWagon = wagonsList.get(i);
                if (wagonCapacity >= currentWagon + passengersWaiting){
                    wagonsList.set(i, currentWagon + passengersWaiting);
                    break;
                }
            }
        }
            input = scanner.nextLine();
        }
        for (int wagon : wagonsList){
            System.out.print(wagon + " ");
        }
    }
}
