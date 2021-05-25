package edu.kielce.lab9;

public class Rectangle extends Figure {
    public Rectangle(double width, double height) {
        super(width, height);
    }

    @Override
    public double getField(){
     return height * width;
    }
}
