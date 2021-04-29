package edu.kielce.exam1.versionA;

public class ExamTriangleMain {
    public static void main(String[] args) {
        ExamTriangle myTriangle1 = new ExamTriangle(5, 5, 5);
        ExamTriangle myTriangle2 = new ExamTriangle(6, 5, 10);
        ExamTriangle myTriangle3 = new ExamTriangle(myTriangle1);
        ExamTriangle myTriangle4 =  new ExamTriangle();

        System.out.println("Is equilateral: " + myTriangle1.isEquilateral());
        System.out.println("Is equilateral: " + myTriangle2.isEquilateral());
        System.out.println("Is equilateral: " + myTriangle3.isEquilateral());
        System.out.println("Is equilateral: " + myTriangle4.isEquilateral());
    }
}
