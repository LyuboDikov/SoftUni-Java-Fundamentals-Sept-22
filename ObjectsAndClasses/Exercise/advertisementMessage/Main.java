package ObjectsAndClasses.Exercise.advertisementMessage;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int messages = Integer.parseInt(scanner.nextLine());

        List<String> phrasesList = Arrays.asList("Excellent product.", "Such a great product.", "I always use that product.",
                "Best product of its category.", "Exceptional product.", "I can’t live without this product.");
        List<String> eventsList = Arrays.asList("Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!",
                "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!");
        List<String> authorsList = Arrays.asList("Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva");
        List<String> citiesList = Arrays.asList("Burgas", "Sofia", "Plovdiv", "Varna", "Ruse");

            Random rnd = new Random();

        for (int message = 1; message <= messages ; message++) {
            int currentPhrase = rnd.nextInt(phrasesList.size());
            int currentEvent = rnd.nextInt(eventsList.size());
            int currentAuthor = rnd.nextInt(authorsList.size());
            int currentCity = rnd.nextInt(citiesList.size());

            String phrase = phrasesList.get(currentPhrase);
            String event = eventsList.get(currentEvent);
            String author = authorsList.get(currentAuthor);
            String city = citiesList.get(currentCity);

            System.out.printf("%s %s %s - %s\n", phrase, event, author, city);
        }
    }
}
