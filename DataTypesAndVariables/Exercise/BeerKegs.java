package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //прочитаме колко кега имаме;
        int kegsCount = Integer.parseInt(scanner.nextLine());
        //за всеки кег, прочитаме модела, радиуса (дробно число) и височината (цяло число);
        double maxVolume = Double.MIN_VALUE;
        String biggestKeg = "";
        for (int keg = 1; keg <= kegsCount ; keg++) {
            String kegModel = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            // намираме обема на дадения кег;
            double kegVolume = Math.PI * Math.pow(radius, 2) * height;

            // проверяваме дали дадения модел кег е по-голям от досегашния максимум

            if (kegVolume > maxVolume){
                maxVolume = kegVolume;
                biggestKeg = kegModel;
            }
        }
        System.out.println(biggestKeg);
    }
}
