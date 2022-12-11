package AssociativeArrays.Exercise;

import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> courses = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("end")){

            String course = input.split(" : ")[0];
            String student = input.split(" : ")[1];

            if (!courses.containsKey(course)){
                courses.put(course, new ArrayList<>());
            }
            courses.get(course).add(student);

            input = scanner.nextLine();
        }
        courses.forEach((key, value) -> {
            System.out.println(key + ": " + value.size());
            value.forEach(studentName -> System.out.println("-- " + studentName));
        });
    }
}
