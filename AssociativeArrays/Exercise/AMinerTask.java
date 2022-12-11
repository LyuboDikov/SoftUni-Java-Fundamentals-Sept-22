package AssociativeArrays.Exercise;

import java.util.*;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> resources = new ArrayList<>();
        List<Integer> qty = new ArrayList<>();

        String input = scanner.nextLine();
        int counter = 0;

        while (!input.equals("stop")){
            counter++;

            if (counter % 2 != 0){
                resources.add(input);
            } else {
                qty.add(Integer.parseInt(input));
            }

            input = scanner.nextLine();
        }

        LinkedHashMap<String, Integer> resourcesMap = new LinkedHashMap<>();

        for (int i = 0; i < resources.size(); i++) {
            String currentResource = resources.get(i);
            int currentQty = qty.get(i);

            if (!resourcesMap.containsKey(currentResource)){
                resourcesMap.put(currentResource, currentQty);
            } else {
                resourcesMap.put(currentResource, resourcesMap.get(currentResource) + currentQty);
            }
        }
        for (Map.Entry<String, Integer> entry : resourcesMap.entrySet()){
            System.out.printf("%s -> %d\n", entry.getKey(), entry.getValue());
        }
    }
}
