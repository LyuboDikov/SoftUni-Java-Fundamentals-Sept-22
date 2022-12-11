package RegularExpressions.Exercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String participants = scanner.nextLine();

        List<String> names = Arrays.stream(participants.split(", ")).collect(Collectors.toList());

        Map<String, Integer>  distances = new LinkedHashMap<>();

        names.forEach(name -> distances.put(name, 0));

        String lettersRegex = "[A-Za-z]+";
        Pattern patternLetters = Pattern.compile(lettersRegex);

        String digitsRegex = "[0-9]";
        Pattern patternDigits = Pattern.compile(digitsRegex);

        String input = scanner.nextLine();

        while (!input.equals("end of race")){

            StringBuilder racerName = new StringBuilder();

            Matcher matcherLetters = patternLetters.matcher(input);

            while (matcherLetters.find()){
                racerName.append(matcherLetters.group());
            }

            int distance = 0;

            Matcher matcherDigits = patternDigits.matcher(input);
            while (matcherDigits.find()){
                distance += Integer.parseInt(matcherDigits.group());
            }

            if (names.contains(racerName.toString())){
                int currentDistance = distances.get(racerName.toString());
                distances.put(racerName.toString(), currentDistance + distance);
            }

            input = scanner.nextLine();
        }

        List<String> top3 = distances.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).
                limit(3).map(entry -> entry.getKey()).collect(Collectors.toList());

        System.out.printf("1st place: %s\n", top3.get(0));
        System.out.printf("2nd place: %s\n", top3.get(1));
        System.out.printf("3rd place: %s", top3.get(2));
    }
}
