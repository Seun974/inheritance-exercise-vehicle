package se.lexicon.samuel;

public class Truck extends Vehicle{

    private int capacity;
    private String manufacturer;

    public Truck(String size, boolean isManual, int capacity, String manufacturer) {
        super("Tata", size, 8, isManual);
    }

    @Override
    public void drive(int velocity) {
        super.drive(velocity);
        System.out.println("Truck name " + getName() + " is moving at a speed of " + velocity + "km/hr");
    }

    public int getCapacity() {
        return capacity;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}
