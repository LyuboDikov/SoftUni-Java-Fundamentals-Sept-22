package Lists.Exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String specialNumAndPower = scanner.nextLine();
        int specialNum = Integer.parseInt(specialNumAndPower.split(" ")[0]);
        int power = Integer.parseInt(specialNumAndPower.split(" ")[1]);
        int powerCounter = 0;

        int specialIndex = 0;
        for (int i = 0; i < numbersList.size(); i++) {
            if (numbersList.get(i) == specialNum){
                specialIndex = i;
                for (int j = 0; j < power; j++) {
                    if (specialIndex != 0){
                    numbersList.remove(specialIndex - 1);
                    specialIndex-=1;
                    } else {
                        break;
                    }
                }
                for (int j = 0; j < power; j++) {
                    if (specialIndex != numbersList.size() - 1){
                    numbersList.remove(specialIndex + 1);
                    } else {
                        break;
                    }
                }
            }
        }
        numbersList.removeAll(Collections.singleton(specialNum));

        int sum = 0;
        for (int number : numbersList){
            sum += number;
        }
        System.out.println(sum);
    }
}
