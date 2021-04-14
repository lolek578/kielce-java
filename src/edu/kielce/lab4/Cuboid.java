package edu.kielce.lab4;

public class Cuboid {
    double width, depth, height;

    public Cuboid(double width, double depth, double height) {
        this.width = width;
        this.depth = depth;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    double getDiagonal(){
        return Math.sqrt(Math.pow(width, 2) + Math.pow(depth, 2) + Math.pow(height, 2));
    }

    double getCapacity(){
        return width*depth*height;
    }

    double getArea(){
        return(2*(width*height + width*depth + height*depth));
    }
}
