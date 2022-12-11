package AssociativeArrays.Exercise;

import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<Double>> studentGrade = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            String studentName = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if (!studentGrade.containsKey(studentName)) {
                studentGrade.put(studentName, new ArrayList<>());
            }
            studentGrade.get(studentName).add(grade);
        }

        Map<String, Double> averageGrades = new LinkedHashMap<>();

        for (Map.Entry<String, List<Double>> entry : studentGrade.entrySet()) {

            String name = entry.getKey();
            List<Double> listGrades = entry.getValue();

            double averageGrade = getAverageGrade(listGrades);

            if (averageGrade >= 4.50) {
                averageGrades.put(name, averageGrade);
            }
        }
        averageGrades.entrySet().forEach(entry -> System.out.printf("%s -> %.2f\n", entry.getKey(), entry.getValue()));
    }

    private static double getAverageGrade(List<Double> listGrades) {

        double sumGrade = 0;
        for (double grade : listGrades) {
            sumGrade += grade;
        }
        return sumGrade / listGrades.size();
    }
}
