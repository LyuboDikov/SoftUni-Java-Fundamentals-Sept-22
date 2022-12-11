package ObjectsAndClasses.Exercise.vehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Vehicle> vehicleList = new ArrayList<>();

        while (!input.equals("End")) {
            String[] vehicleData = input.split(" ");

            String type = vehicleData[0];
            String model = vehicleData[1];
            String color = vehicleData[2];
            String horsepower = vehicleData[3];

            Vehicle vehicle = new Vehicle(type, model, color, horsepower);
            vehicleList.add(vehicle);

            input = scanner.nextLine();
        }

        while (!input.equals("Close the Catalogue")) {

            for (Vehicle vehicle : vehicleList) {
                if (vehicle.getModel().equals(input)) {
                    System.out.print(vehicle);
                }
            }
            input = scanner.nextLine();
        }

        int carsHorsepowerTotal = 0;
        int trucksHorsepowerTotal = 0;
        int carsCounter = 0;
        int trucksCounter = 0;

        for (Vehicle vehicle : vehicleList) {
            if (vehicle.getType().equals("car")) {
                carsHorsepowerTotal += Integer.parseInt(vehicle.getHorsepower());
                carsCounter++;
            } else if (vehicle.getType().equals("truck")) {
                trucksHorsepowerTotal += Integer.parseInt(vehicle.getHorsepower());
                trucksCounter++;
            }
        }
        if (carsCounter > 0) {
            double carsAverageHorsePower = carsHorsepowerTotal * 1.0 / carsCounter;
            System.out.printf("Cars have average horsepower of: %.2f.\n", carsAverageHorsePower);
        } else {
            System.out.println("Cars have average horsepower of: 0.00.");
        }

        if (trucksCounter > 0){
        double trucksAverageHorsePower = trucksHorsepowerTotal * 1.0 / trucksCounter;
        System.out.printf("Trucks have average horsepower of: %.2f.\n", trucksAverageHorsePower);
        } else {
            System.out.println("Trucks have average horsepower of: 0.00.");
        }

    }
}
