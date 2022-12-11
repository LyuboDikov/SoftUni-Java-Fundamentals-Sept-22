package Arrays.Exercise;

import java.util.Scanner;

public class TreasureHunt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] treasureChest = scanner.nextLine().split("\\|");

        String command = scanner.nextLine();

        while(!command.equals("Yohoho!")){
            String[] lootElements = command.split(" ");

            switch (lootElements[0]){
                case "Loot":
                    for (int i = 1; i < lootElements.length; i++) {
                        boolean alreadyInChest = false;
                        for (int j = 0; j < treasureChest.length; j++) {
                            if (lootElements[i].equals(treasureChest[j])){
                                alreadyInChest = true;
                                break;
                            }
                        }
                        if (!alreadyInChest){
                            String newChest = lootElements[i] + " " + String.join(" ", treasureChest);
                            treasureChest = newChest.split(" ");
                        }
                    }
                    break;
                case "Drop":
                    int position = Integer.parseInt(lootElements[1]);

                    if (position <= treasureChest.length - 1 && position >= 0){
                        String droppedItem = treasureChest[position];

                        for (int i = position; i < treasureChest.length - 1 ; i++) {
                            treasureChest[i] = treasureChest[i + 1];
                        }
                        treasureChest[treasureChest.length - 1] = droppedItem;
                    } else {
                        break;
                    }
                    break;
                case "Steal":
                    int itemsStolen = Integer.parseInt(lootElements[1]);

                    if (itemsStolen >= 0 && itemsStolen < treasureChest.length){
                        for (int i = 0; i < itemsStolen; i++) {
                            System.out.print(treasureChest[treasureChest.length - itemsStolen + i]);
                            if (i != itemsStolen - 1){
                                System.out.print(", ");
                            }
                            }
                            String[] currentChest = new String [treasureChest.length - itemsStolen];
                        for (int i = 0; i < currentChest.length; i++) {
                            currentChest[i] = treasureChest[i];
                        }
                        treasureChest = currentChest;

                        } else if (itemsStolen >= 0){
                        for (int i = 0; i < treasureChest.length; i++) {
                            System.out.print(treasureChest[i]);
                            if (i != treasureChest.length - 1){
                                System.out.print(", ");
                            }
                        }
                        treasureChest = new String[0];
                    }
                    System.out.println();
                    break;
            }
            command = scanner.nextLine();
        }
        String totalLoot = String.join("", treasureChest);

        int charCount = 0;
        for (int i = 0; i < totalLoot.length(); i++) {
            charCount++;
        }
        double averageTreasure = (1.0 * charCount / treasureChest.length);
        if (charCount > 0){
            System.out.printf("Average treasure gain: %.2f pirate credits.", averageTreasure);
        } else {
            System.out.println("Failed treasure hunt.");
        }
    }
}
