package se.lexicon.samuel;

public class Vehicle {
    private String name;
    private String size;
    private int tyres;
    private boolean isManual;

    private int velocity;

    //constructor for the fields
    public Vehicle(String name, String size, int tyres, boolean isManual) {
        this.name = name;
        this.size = size;
        this.tyres = tyres;
        this.isManual = isManual;

        this.velocity = 0;
    }
    //getters for the fields
    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getTyres() {
        return tyres;
    }

    public boolean isManual() {
        return isManual;
    }

    public void drive(int velocity){
        System.out.println("Vehicle.drive(): Moving at " + velocity + "km/h");

    }
}
