package ObjectsAndClasses.Exercise.vehicleCatalogue;

import java.util.Locale;

public class Vehicle {

    private String type;
    private String model;
    private String color;
    private String horsepower;

    public Vehicle(String type, String model, String color, String horsepower) {
        this.type = type;
        this.model = model;
        this.color = color;
        this.horsepower = horsepower;
    }

    public String getModel() {
        return this.model;
    }

    public String getHorsepower() {
        return this.horsepower;
    }

    public String getType() {
        return this.type;
    }

    @Override
    public String toString() {
        return String.format("Type: %s\n" +
                "Model: %s\n" +
                "Color: %s\n" +
                "Horsepower: %s\n", this.type.substring(0,1).toUpperCase() + this.type.substring(1), this.model, this. color, this.horsepower);
    }
}
