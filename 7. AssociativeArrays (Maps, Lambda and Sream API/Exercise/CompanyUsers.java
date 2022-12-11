package AssociativeArrays.Exercise;

import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> company = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String[] inputData = input.split(" -> ");
            String companyName = inputData[0];
            String employee = inputData[1];

            if (!company.containsKey(companyName)) {
                company.put(companyName, new ArrayList<>());
                company.get(companyName).add(employee);
            } else {
                if (!company.get(companyName).contains(employee))
                    company.get(companyName).add(employee);
            }
            input = scanner.nextLine();
        }
        company.forEach((key, value) -> {
            System.out.println(key);
            value.forEach(employee -> System.out.println("-- " + employee));
        });
    }
}
