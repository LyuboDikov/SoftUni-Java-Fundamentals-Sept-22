package ObjectsAndClasses.Exercise.students;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Student> studentList = new ArrayList<>();

        for (int i = 1; i <= n ; i++) {
            String inputData = scanner.nextLine();

            String firstName = inputData.split(" ")[0];
            String lastName = inputData.split(" ")[1];
            double grade = Double.parseDouble(inputData.split(" ")[2]);

            Student student = new Student(firstName, lastName, grade);

            studentList.add(student);
        }
        studentList.sort(Comparator.comparing(Student::getGrade).reversed());

        for (Student student : studentList){
            System.out.println(student);
        }
    }
}
