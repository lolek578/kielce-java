package edu.kielce.lab9.Protected.Second.Training;

import edu.kielce.lab9.Protected.Training.Vehicle;

class Truck extends Vehicle {
    protected int capacity;

    public Truck(String name, int capacity) {
        super(name);
        this.capacity = capacity;
    }
}
