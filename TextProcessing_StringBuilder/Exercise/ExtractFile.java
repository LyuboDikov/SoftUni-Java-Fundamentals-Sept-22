package TextProcessing_StringBuilder.Exercise;

import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] inputArr = input.split("\\\\");

        String substring = inputArr[inputArr.length - 1];
        String[] substringArr = substring.split("\\.");

        String fileName = substringArr[0];
        String fileExtension = substringArr[1];

        System.out.printf("File name: %s\n", fileName);
        System.out.printf("File extension: %s", fileExtension);
    }
}
