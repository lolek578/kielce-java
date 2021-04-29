package edu.kielce.lab7;

import java.time.Year;

public class Vehicle {
    protected String name;
    protected String registrationNumber;
    protected Year year;

    public Vehicle(){
        this.name = "";
        this.registrationNumber = "";
        this.year = Year.now();
    }

    public Vehicle(String name, String registrationNumber, Year year) {
        this.name = name;
        this.registrationNumber = registrationNumber;
        this.year = year;
    }

    protected void info(){
        System.out.print("Name: " + name + "\tRegistration: " + registrationNumber + "\tYear: " + year);
    }

}
