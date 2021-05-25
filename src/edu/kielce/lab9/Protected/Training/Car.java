package edu.kielce.lab9.Protected.Training;

class Car extends Vehicle{
    protected int power;

    Car(String name, int power) {
        super(name);
        this.power = power;
    }
}
