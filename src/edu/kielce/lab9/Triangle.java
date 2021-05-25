package edu.kielce.lab9;

public class Triangle extends Figure{
    public Triangle(double width, double height) {
        super(width, height);
    }

    @Override
    public double getField() {
        return (height * width) / 2;
    }
}
