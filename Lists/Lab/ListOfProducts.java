package Lists.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<String> productsList = new ArrayList<>();

        for (int i = 1; i <= n ; i++) {
            String product = scanner.nextLine();
            productsList.add(product);
        }
        List<String> sortedList = productsList.stream().sorted().collect(Collectors.toList());

            int productNum = 1;
        for (String product : sortedList){
            System.out.printf("%d.%s\n", productNum, product);
            productNum++;
        }
    }
}
