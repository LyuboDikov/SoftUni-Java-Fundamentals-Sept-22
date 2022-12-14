package AssociativeArrays.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class WordFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> words = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        for (String word : words){
            if (word.length() % 2 == 0){
                System.out.println(word);
            }
        }
    }
}
