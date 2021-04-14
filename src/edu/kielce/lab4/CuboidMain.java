package edu.kielce.lab4;

public class CuboidMain {
    public static void main(String[] args) {
        Cuboid cuboid1 = new Cuboid(10, 15, 20);
        System.out.println("Cuboid diagonal = " + cuboid1.getDiagonal());
        System.out.println("Cuboid area = " + cuboid1.getArea());
        System.out.println("Cuboid capacity = " + cuboid1.getCapacity());

    }
}
