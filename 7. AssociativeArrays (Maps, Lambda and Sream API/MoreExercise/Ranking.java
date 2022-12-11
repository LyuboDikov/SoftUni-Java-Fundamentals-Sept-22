package AssociativeArrays.MoreExercise;

import java.util.*;

public class Ranking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, String> contestMap = new LinkedHashMap<>();

        while(!input.equals("end of contests")){

            String contest = input.split(":")[0];
            String passForContest = input.split(":")[1];

            if (!contestMap.containsKey(contest)) {
                contestMap.put(contest, passForContest);
            }

            input = scanner.nextLine();
        }

        String data = scanner.nextLine();
        TreeMap<String, LinkedHashMap<String, Integer>> usersMap = new TreeMap<>();

        while(!data.equals("end of submissions")){

            String contest = data.split("=>")[0];
            String password = data.split("=>")[1];
            String username = data.split("=>")[2];
            int points = Integer.parseInt(data.split("=>")[3]);

            if (contestMap.containsKey(contest)){
                if (contestMap.containsValue(password)){
                    LinkedHashMap<String, Integer> contestResult = new LinkedHashMap<>();
                    contestResult.put(contest, points);
                    if (!usersMap.containsKey(username)){
                        usersMap.put(username, contestResult);
                    } else {
                        if (!usersMap.get(username).containsKey(contest)){
                            usersMap.get(username).put(contest, points);
                        } else {
                            usersMap.get(username).put(contest, Math.max(points, usersMap.get(username).get(contest)));
                        }
                    }
                }
            }
            data = scanner.nextLine();
        }

        int winnerPoints = 0;

        for (Map.Entry<String, LinkedHashMap<String, Integer>> entry : usersMap.entrySet()){
            int sum = entry.getValue().values().stream().mapToInt(i -> i).sum();
            if (sum > winnerPoints){
                winnerPoints = sum;
            }
        }
        for (Map.Entry<String, LinkedHashMap<String, Integer>> entry : usersMap.entrySet()){
            if (entry.getValue().values().stream().mapToInt(i -> i).sum() == winnerPoints){
                System.out.printf("Best candidate is %s with total %d points.\n", entry.getKey(), winnerPoints);
            }
        }
        System.out.println("Ranking: ");
        usersMap.forEach((key, value) -> {
            System.out.printf("%s\n", key);
            value.entrySet().stream().sorted((f, s) -> s.getValue() - f.getValue()).forEach(i -> System.out.printf("#  %s -> %d\n", i.getKey(), i.getValue()));
        });
    }
}
