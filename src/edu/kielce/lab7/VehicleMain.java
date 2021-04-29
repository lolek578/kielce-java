package edu.kielce.lab7;

import java.time.Year;

public class VehicleMain {
    public static void main(String[] args) {
        Vehicle car = new Vehicle("Porsche", "abc123", Year.of(2020));
        car.info();
        System.out.print("\n");

        Tram tram = new Tram("Lajkonik" , "xyz321", Year.of(1999), 30);
        tram.info();
        System.out.print("\n");

        PassengerCar passengerCar = new PassengerCar("Mazda 6", "Orange",
                                                    Year.of(2005), 200);
        passengerCar.info();
        System.out.print("\n");

        Truck truck = new Truck("STAR" , "Apple7", Year.of(1990), 1000);
        truck.info();
    }
}
