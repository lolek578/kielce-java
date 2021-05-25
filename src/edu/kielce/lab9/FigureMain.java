package edu.kielce.lab9;

public class FigureMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 15);
        Triangle  triangle = new Triangle(50,50);

        System.out.println(rectangle.getField());
        System.out.println(triangle.getField());
    }
}
