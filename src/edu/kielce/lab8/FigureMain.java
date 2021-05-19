package edu.kielce.lab8;

public class FigureMain {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        District district = new District();

        FigureTest.drawFigure(triangle);
        FigureTest.drawFigure(district);
    }
}
