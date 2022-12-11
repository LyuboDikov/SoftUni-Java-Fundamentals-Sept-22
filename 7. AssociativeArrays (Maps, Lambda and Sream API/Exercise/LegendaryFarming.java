package AssociativeArrays.Exercise;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<String, Integer> legendary = new LinkedHashMap<>();
        legendary.put("shards", 0);
        legendary.put("fragments", 0);
        legendary.put("motes", 0);


        Map<String, Integer> junk = new LinkedHashMap<>();

        boolean hasWon = false;

        while (true) {
        String input = scanner.nextLine();
        String[] inputData = input.split(" ");
            for (int index = 0; index <= inputData.length - 1; index += 2) {
                int quantity = Integer.parseInt(inputData[index]);
                String material = inputData[index + 1].toLowerCase();

                if (material.equals("shards") || material.equals("fragments") || material.equals("motes")) {
                    int currentQuantity = legendary.get(material);
                    legendary.put(material, currentQuantity + quantity);
                } else {
                    if (!junk.containsKey(material)) {
                        junk.put(material, quantity);
                    } else {
                        int currentQuantityJunk = junk.get(material);
                        junk.put(material, currentQuantityJunk + quantity);
                    }
                }

                if (legendary.get("shards") >= 250) {
                    System.out.println("Shadowmourne obtained!");
                    legendary.put("shards", legendary.get("shards") - 250);
                    hasWon = true;
                    break;
                } else if (legendary.get("fragments") >= 250) {
                    System.out.println("Valanyr obtained!");
                    legendary.put("fragments", legendary.get("fragments") - 250);
                    hasWon = true;
                    break;
                } else if (legendary.get("motes") >= 250) {
                    System.out.println("Dragonwrath obtained!");
                    legendary.put("motes", legendary.get("motes") - 250);
                    hasWon = true;
                    break;
                }
            }
            if (hasWon) {
                break;
            }
        }
        legendary.entrySet().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));

        junk.entrySet().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }
}

