package Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstPlayer = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondPlayer = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        while (true){
            int playerOneCard = firstPlayer.get(0);
            int playerTwoCard = secondPlayer.get(0);
            if (playerOneCard > playerTwoCard){
                firstPlayer.add(playerOneCard);
                firstPlayer.add(playerTwoCard);
                firstPlayer.remove(0);
                secondPlayer.remove(0);
            } else if (playerTwoCard > playerOneCard) {
                secondPlayer.add(playerTwoCard);
                secondPlayer.add(playerOneCard);
                firstPlayer.remove(0);
                secondPlayer.remove(0);
            } else {
                firstPlayer.remove(0);
                secondPlayer.remove(0);
            }
            if (firstPlayer.size() == 0 || secondPlayer.size() == 0){
                break;
            }
        }
        int firstPlayerSum = 0;
        for (int num : firstPlayer){
            firstPlayerSum += num;
        }
        int secondPlayerSum = 0;
        for (int num : secondPlayer){
            secondPlayerSum += num;
        }
        if (firstPlayerSum > secondPlayerSum){
            System.out.printf("First player wins! Sum: %d", firstPlayerSum);
        } else {
            System.out.printf("Second player wins! Sum: %d", secondPlayerSum);
        }
    }
}
