package se.lexicon.samuel;

public class Car extends Vehicle{
    private int wheels;
    private int gears;
    private int doors;


    public Car(int tyres, boolean isManual, int wheels, int gears, int doors) {
        super("Volvo", "SUV", tyres, isManual);
        this.wheels = wheels;
        this.gears = gears;
        this.doors = doors;

    }

    @Override
    public void drive(int velocity) {
        super.drive(velocity);
        System.out.println("Vehicle of Car type " + getName() + " is moving at a speed of " + velocity + "km/hr");
    }

    public int getWheels() {
        return wheels;
    }

    public int getGears() {
        return gears;
    }

    public int getDoors() {
        return doors;
    }
}
