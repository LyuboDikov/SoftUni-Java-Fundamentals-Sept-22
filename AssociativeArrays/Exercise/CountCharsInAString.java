package AssociativeArrays.Exercise;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        LinkedHashMap<Character, Integer> counts = new LinkedHashMap<>();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (currentChar == ' '){
                continue;
            }
            if (!counts.containsKey(currentChar)){
                counts.put(currentChar, 0);
            }
            counts.put(currentChar, counts.get(currentChar) + 1);
        }

        for (Map.Entry<Character, Integer> entry : counts.entrySet()){
            System.out.printf("%c -> %d\n", entry.getKey(), entry.getValue());
        }
    }
}
