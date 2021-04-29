package edu.kielce.lab7;

import java.time.Year;

public class Truck extends Car{
    private int capacity;

    public Truck(String name, String registrationNumber, Year year, int capacity) {
        super(name, registrationNumber, year);
        this.capacity = capacity;
    }

    protected void info(){
        super.info();
        System.out.print("\tcapacity: " + capacity);
    }
}
