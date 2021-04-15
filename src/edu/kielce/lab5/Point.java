package edu.kielce.lab5;

public class Point {
private double coordinateX;
private double coordinateY;

    Point(){
        coordinateX = 0;
        coordinateY = 0;
    };

    Point(double coordinateX, double coordinateY){
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    Point(Point point){
        coordinateX = point.coordinateX;
        coordinateY = point.coordinateY;
    }

    void setX(double x) {
        this.coordinateX = x;
    }

    void setY(double y){
        this.coordinateY = y;
    }

    double getX(){
        return coordinateX;
    }

    double getY(){
        return coordinateY;
    }

    void setXY(double coordinateX, double coordinateY){
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    void setXY(Point point){
        this.coordinateX = point.coordinateX;
        this.coordinateY = point.coordinateY;
    }

    public String toString(){
        return("x = " + coordinateX + "\t y = " + coordinateY);
    }

    double distanceFromPoint(Point point){
        double distance = Math.sqrt(Math.pow(coordinateX - point.coordinateX, 2) +
                                    Math.pow(coordinateY - point.coordinateY, 2));
        return distance;
    }
}
