package RegularExpressions.Exercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String regexStar = "[STARstar]";
        Pattern patternStar = Pattern.compile(regexStar);

        String regexMessage = "@(?<planet>[A-Za-z]+)[^@\\-!:>]*:(?<population>\\d+)[^@\\-!:>]*\\!(?<attackType>[AD])\\![^@\\-!:>]*->(?<soldierCount>\\d+)";
        Pattern patternMessage = Pattern.compile(regexMessage);

        List<String> attackedPlanets = new ArrayList<>();
        List<String> destroyedPlanets = new ArrayList<>();

        for (int i = 1; i <= n ; i++) {

            String message = scanner.nextLine();
            int keyNumber = 0;

            Matcher matcherStar = patternStar.matcher(message);
            while (matcherStar.find()){
                keyNumber++;
            }

            StringBuilder decryptedMessage = new StringBuilder();

            for (int j = 0; j < message.length(); j++) {
                char symbol = message.charAt(j);
                char newSymbol = (char) (symbol - keyNumber);
                decryptedMessage.append(newSymbol);
            }

            Matcher matcherMessage = patternMessage.matcher(decryptedMessage);

            while (matcherMessage.find()){
                String attackType = matcherMessage.group("attackType");
                String planet = matcherMessage.group("planet");

                switch (attackType){
                    case "A":
                        attackedPlanets.add(planet);
                        break;
                    case "D":
                        destroyedPlanets.add(planet);
                        break;
                }
            }
        }
        Collections.sort(attackedPlanets);
        Collections.sort(destroyedPlanets);

        System.out.printf("Attacked planets: %d\n", attackedPlanets.size());
        for (String planet : attackedPlanets){
            System.out.printf("-> %s\n", planet);
        }
        System.out.printf("Destroyed planets: %d\n", destroyedPlanets.size());
        for (String planet : destroyedPlanets){
            System.out.printf("-> %s\n", planet);
        }
    }
}
