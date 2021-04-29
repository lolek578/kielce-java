package edu.kielce.lab7;

import java.time.Year;

public class PassengerCar extends Car{
    private int power;

    public PassengerCar(String name, String registrationNumber, Year year, int power) {
        super(name, registrationNumber, year);
        this.power = power;
    }

    protected void info(){
        super.info();
        System.out.print("\tpower: " + power);
    }

}
