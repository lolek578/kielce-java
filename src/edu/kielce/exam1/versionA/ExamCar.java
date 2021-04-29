package edu.kielce.exam1.versionA;

import java.time.Year;

public class ExamCar {
    private String name;
    private String registrationNumber;
    //teachers showed us only integers for year ;)
    private Year year;

    public ExamCar(String name, String registrationNumber, Year year) {
        this.name = name;
        this.registrationNumber = registrationNumber;
        this.year = year;
    }

    public String toString(){
        return("Name: " + name + "\t Registratiorn number = " + registrationNumber +
                "\t year: " + year);
    }

}
