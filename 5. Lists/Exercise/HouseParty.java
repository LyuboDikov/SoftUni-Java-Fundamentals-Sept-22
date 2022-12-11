package Lists.Exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int commandsCount = Integer.parseInt(scanner.nextLine());
        List<String> namesList = new ArrayList<>(Collections.singleton(""));

        for (int i = 1; i <= commandsCount; i++) {
            String input = scanner.nextLine();
            String[] namesArray = input.split(" ");
            String person = namesArray[0];

            if (input.contains("is going!")) {
                boolean isOnTheList = isOnTheList(namesList, person);
                if (isOnTheList) {
                    System.out.printf("%s is already in the list!\n", person);
                } else {
                    namesList.add(person);
                }
            } else if (input.contains("is not going!")){
                boolean isOnTheList = isOnTheList(namesList, person);
                if (isOnTheList){
                    namesList.remove(person);
                } else {
                    System.out.printf("%s is not in the list!\n", person);
                }
            }
        }
        for (int i = 1; i < namesList.size() ; i++) {
            String name = namesList.get(i);
            System.out.println(name);
        }
    }
    public static boolean isOnTheList(List<String> namesList, String person) {
        boolean isOnTheList = false;
        for (int j = 0; j < namesList.size(); j++) {
            if (person.equals(namesList.get(j))) {
                isOnTheList = true;
                break;
            }
        }
        return isOnTheList;
    }
}
