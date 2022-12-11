package AssociativeArrays.Exercise;

import java.util.*;

public class ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<List<String>, List<String>> sideMap = new LinkedHashMap<>();

        String input = scanner.nextLine();

        String user = "";
        String side = "";
        String changeSide = "";
        while (!input.equals("Lumpawaroo")) {

            String[] inputData = input.split(" ");
            String delimiter = inputData[1];

            switch (delimiter) {
                case "|":
                    user = inputData[2];
                    side = inputData[0];

                    //•	If there is no such force user and no such force side -> create a new force side and add the force user to the corresponding side.
                    if (!sideMap.containsKey(side) && !sideMap.containsValue(user)) {
                        sideMap.put(Collections.singletonList(side), new ArrayList<>());
                        sideMap.get(side).add(user);
                    //•	Only if there is no such force user on any force side -> add the force user to the corresponding side.
                    }else if (!sideMap.get(side).contains(user)) {
                        sideMap.get(side).add(user);
                    }
                    //•	If there is such force user already -> skip the command and continue to the next operation.
                    break;
                case "->":
                    user = inputData[0];
                    side = inputData[2];

                    //•	If there is such force user already -> change their side.
                    if (sideMap.containsValue(user)){
                        if (!sideMap.get(side).contains(user)){
                            changeSide = side;
                        }
                        sideMap.get(side).remove(user);
                        sideMap.get(changeSide).add(user);
                    }
                    //•	If there is no such force user on any force side -> add the force user to the corresponding force side.
                    else if (!sideMap.containsValue(user)){
                        sideMap.put(Collections.singletonList(side), Collections.singletonList(user));
                    }
                    //•	If there is no such force user and no such force side -> create a new force side and add the force user to the corresponding side.
                    else if (!sideMap.containsKey(side) && !sideMap.containsValue(user)){
                        sideMap.get(side).add(user);
                    }
                    System.out.printf("%s joins the %s side!", sideMap.get(user), sideMap.get(side));
                    //•	Then you should print on the console: "{force_user} joins the {force_side} side!".
                    break;
            }


            input = scanner.nextLine();
        }
        System.out.println();
    }
}
