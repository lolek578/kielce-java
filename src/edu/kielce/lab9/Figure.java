package edu.kielce.lab9;

abstract class Figure {
    double width;
    double height;

    public Figure() {
    }

    public Figure(double width, double height) {
        this.width = width;
        this.height = height;
    }

    abstract double getField();
}
