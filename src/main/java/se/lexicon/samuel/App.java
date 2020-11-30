package se.lexicon.samuel;


import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class App
{
    public static void main( String[] args ) {

        Vehicle vehicle = new Vehicle("Volvo", "AWD", 4, false);
        vehicle.drive(30);
        Car car = new Car(4, true,4,6,4);
        System.out.println(car.getWheels());
        car.drive(100);

        Motorcycle motorcycle = new Motorcycle("200cc", false, "BMW", "all terrain");
        System.out.println(motorcycle.getBrand());
        motorcycle.drive(120);


        Truck truck = new Truck("1000tons", true, 100000, "Mercedes");
        truck.drive(60);


    }
}
