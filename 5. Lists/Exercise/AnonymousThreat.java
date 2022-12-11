package Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Spliterator;
import java.util.stream.Collectors;

public class AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> inputList = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("3:1")) {
        String[] inputArr = input.split("\\s+");

            if (input.contains("merge")) {
                int startIndex = Integer.parseInt(inputArr[1]);
                int endIndex = Integer.parseInt(inputArr[2]);
                String tempText = "";

                if (startIndex < 0) {
                    startIndex = 0;
                }
                if (endIndex > inputList.size() - 1) {
                    endIndex = inputList.size() - 1;
                }

                boolean isValidIndex = startIndex <= inputList.size() - 1 && endIndex >= 0 && startIndex < endIndex;

                if (isValidIndex) {
                    for (int i = startIndex; i <= endIndex; i++) {
                        tempText += inputList.get(i);
                    }
                    inputList.set(startIndex, tempText);
                    for (int i = startIndex + 1; i <= endIndex; i++) {
                        inputList.remove(i);
                        i--;
                        endIndex--;
                    }
                }
            } else if (input.contains("divide")) {
                int index = Integer.parseInt(inputArr[1]);
                int partitions = Integer.parseInt(inputArr[2]);

                String elementDivide = inputList.get(index);
                inputList.remove(index);

                int partSize = elementDivide.length() / partitions;

                int beginIndex = 0;

                for (int i = 1; i < partitions; i++) {
                    inputList.add(index, elementDivide.substring(beginIndex, beginIndex + partSize));
                    index++;
                    beginIndex += partSize;
                }
                inputList.add(index, elementDivide.substring(beginIndex));
            }
            input = scanner.nextLine();
        }
        System.out.println(String.join(" ", inputList));
    }
}