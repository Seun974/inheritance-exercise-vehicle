package se.lexicon.samuel;

public class Motorcycle extends Vehicle{
    private String brand;
    private String type;


    public Motorcycle(String size, boolean isManual, String brand, String type) {
        super("BMW", size, 2, isManual);
        this.brand = brand;
        this.type = type;
    }

    @Override
    public void drive(int velocity) {
        super.drive(velocity);
        System.out.println("Motorcycle brand " + getName() + " is moving at a speed of " + velocity + "km/hr");

    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }
}
