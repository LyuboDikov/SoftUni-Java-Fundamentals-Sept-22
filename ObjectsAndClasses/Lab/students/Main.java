package ObjectsAndClasses.Lab.students;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Student> studentList = new ArrayList<>();

        while (!input.equals("end")) {

            String firstName = input.split("\\s+")[0];
            String lastName = input.split("\\s+")[1];
            int age = Integer.parseInt(input.split("\\s+")[2]);
            String hometown = input.split("\\s+")[3];

            if (isExisting(studentList, firstName, lastName)) {
                Student student = getStudent(studentList, firstName, lastName);

                student.setFirstName(firstName);
                student.setLastName(lastName);
                student.setAge(age);
                student.setHometown(hometown);

            } else {
                Student student = new Student(firstName, lastName, age, hometown);
                studentList.add(student);
            }

            input = scanner.nextLine();
        }

        String cityName = scanner.nextLine();

        for (Student student : studentList) {
            if (student.getHometown().equals(cityName)) {
                System.out.println(student);
            }
        }
    }

    private static boolean isExisting(List<Student> studentList, String firstName, String lastName) {
        for (Student student : studentList) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                return true;
            }
        }
        return false;
    }

    private static Student getStudent(List<Student> studentList, String firstName, String lastName) {
        Student existingStudent = null;

        for (Student student : studentList) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                existingStudent = student;
            }
        }
        return existingStudent;
    }
}

