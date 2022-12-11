package Lists.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> schedule = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("course start")) {
            String[] commandArray = command.split(":");
            String lessonTitle = commandArray[1];
            String currentCommand = commandArray[0];

            switch (currentCommand) {
                case "Add":
                    if (!isInSchedule(lessonTitle, schedule)) {
                        schedule.add(lessonTitle);
                    }
                    break;
                case "Insert":
                    if (!isInSchedule(lessonTitle, schedule)) {
                        int index = Integer.parseInt(commandArray[2]);
                        schedule.add(index, lessonTitle);
                    }
                    break;
                case "Remove":
                    if (isInSchedule(lessonTitle, schedule)) {
                        schedule.remove(lessonTitle);
                    }
                    int indexLesson = schedule.indexOf(lessonTitle);
                    if (schedule.get(indexLesson + 1).equals(lessonTitle + "-Exercise")) {
                        schedule.remove(indexLesson + 1);
                    }
                    break;
                case "Swap":
                    String secondLessonTitle = commandArray[2];

                    if (isInSchedule(lessonTitle, schedule) && isInSchedule(secondLessonTitle, schedule)) {
                        int lessonIndex = schedule.indexOf(lessonTitle);
                        int secondLessonIndex = schedule.indexOf(secondLessonTitle);

                        schedule.set(lessonIndex, secondLessonTitle);
                        schedule.set(secondLessonIndex, lessonTitle);

                        String firstLessonExercise = lessonTitle + "-Exercise";
                        String secondLessonExercise = secondLessonTitle + "-Exercise";

                        if (isInSchedule(firstLessonExercise, schedule)) {
                            schedule.remove(schedule.indexOf(firstLessonExercise));
                            schedule.add(schedule.indexOf(lessonTitle) + 1, firstLessonExercise);
                        }
                        if (isInSchedule(secondLessonExercise, schedule)) {
                            schedule.remove(schedule.indexOf(secondLessonExercise));
                            schedule.add(schedule.indexOf(secondLessonTitle) + 1, secondLessonExercise);
                        }
                    }
                    break;
                case "Exercise":
                    String exercise = lessonTitle + "-Exercise";
                    int lessonIndex = schedule.indexOf(lessonTitle);

                    if (isInSchedule(lessonTitle, schedule)) {
                        if (lessonIndex == schedule.size() - 1) {
                            schedule.add(lessonIndex + 1, exercise);
                        } else if (!schedule.get(lessonIndex + 1).equals(exercise)) {
                            schedule.add(lessonIndex + 1, exercise);
                        } else {
                            schedule.add(lessonTitle);
                            schedule.add(exercise);
                        }
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        for (int number = 0; number < schedule.size(); number++) {
            String lesson = schedule.get(number);
            System.out.printf("%d.%s\n", number + 1, lesson);
        }
    }
    public static boolean isInSchedule(String lesson, List<String> schedule) {

        for (int i = 0; i < schedule.size(); i++) {
            String currentLesson = schedule.get(i);
            if (lesson.equals(currentLesson)) {
                return true;
            }
        }
        return false;
    }
}