package RegularExpressions.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class NetherRealms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<String> demons = Arrays.stream(input.split(",\\s+")).collect(Collectors.toList());

        String regexName = "";
    }
}
