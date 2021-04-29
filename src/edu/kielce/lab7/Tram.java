package edu.kielce.lab7;

import java.time.Year;

public class Tram extends Vehicle {
    private int numberOfPassengers;

    public Tram(String name, String registrationNumber, Year year, int numberOfPassengers) {
        super(name, registrationNumber, year);
        this.numberOfPassengers = numberOfPassengers;
    }

    protected void info(){
        super.info();
        System.out.print("\tpassengers:  " + numberOfPassengers);

    }
}
