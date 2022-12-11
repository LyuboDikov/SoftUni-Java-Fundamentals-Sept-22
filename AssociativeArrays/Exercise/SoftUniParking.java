package AssociativeArrays.Exercise;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int commandsCount = Integer.parseInt(scanner.nextLine());

        Map <String, String> usernames = new LinkedHashMap<>();

        for (int i = 1; i <= commandsCount ; i++) {

            String input = scanner.nextLine();
            String command = input.split(" ")[0];
            String user = input.split(" ")[1];

            switch (command){
                case "register":
                    String licensePlate = input.split(" ")[2];
                    if (!usernames.containsKey(user)){
                        usernames.put(user, licensePlate);
                        System.out.printf("%s registered %s successfully\n", user, licensePlate);
                    } else {
                        System.out.printf("ERROR: already registered with plate number %s\n", licensePlate);
                    }
                    break;
                case "unregister":
                    if (!usernames.containsKey(user)){
                        System.out.printf("ERROR: user %s not found\n", user);
                    } else {
                        usernames.remove(user);
                        System.out.printf("%s unregistered successfully\n", user);
                    }
                    break;
            }
        }
        for (Map.Entry<String, String> entry : usernames.entrySet()){
            System.out.printf("%s => %s\n", entry.getKey(), entry.getValue());
        }
    }
}
