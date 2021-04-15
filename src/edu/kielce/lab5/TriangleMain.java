package edu.kielce.lab5;

public class TriangleMain {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(3, 4, 5);

        Point point1 = new Point(3,1);
        Point point2 = new Point(3,-2);
        Point point3 = new Point(-2,-2);

        System.out.println("Triangle with sides constructor");
        System.out.println(triangle1.toString());

        System.out.println("Triangle with points constructor");
        Triangle triangle2 = new Triangle(point1, point2, point3);
        System.out.println(triangle2.toString());


    }
}
