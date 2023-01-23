import java.util.Locale;

public class Car {
    private String make;
    private String model;
    private String color;
    private int doors;
    private boolean convertible;

    public void describeCar() {
        System.out.println(make + " " + model + " " + color + " " + doors + " doors " +
                (convertible ? "convertible" : ""));
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public String getMake(){
        return make;
    }
    public void setMake(String make){
        if (make == null) {make = "Unknown";};
        String makeToLowerCase = make.toLowerCase();
        switch(makeToLowerCase) {
            case "porsche", "maserati", "tesla" -> this.make = make;
            default -> {
                this.make = "Unsupported";
            }
        }
    }
}
