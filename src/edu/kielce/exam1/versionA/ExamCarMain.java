package edu.kielce.exam1.versionA;

import java.time.Year;

public class ExamCarMain {
    public static void main(String[] args) {
        String[] names = {"Porsche", "Suzuki", "Mazda"};
        String[] registrations = {"ERA 75TM", "DW 688CC", "DBL PR62"};
        Year[] years = {Year.of(2020), Year.of(2000), Year.of(2015)};

        ExamCar car[] = new ExamCar[3];

        for (int i = 0; i < 3; i++) {
            String name = names[i];
            String registration = registrations[i];
            Year year = years[i];
            car[i] = new ExamCar(name, registration, year);
            System.out.println(car[i].toString());
        }
    }
}
