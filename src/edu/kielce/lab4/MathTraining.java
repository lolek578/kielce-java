package edu.kielce.lab4;

public class MathTraining {
    public static void main(String[] args) {
        System.out.println("Wartosc bezwgledna -5 to = " + Math.abs(-5));
        System.out.println("5 + 12 = " + Math.addExact(5, 12));
        System.out.println("5.12 po zaokragleniu w dol to = " + Math.round(5.12));

        int a = 5;
        int b = 10;

        System.out.println("a+b = " + (a+b));
        System.out.println("a-b = " + (a-b));
        System.out.println("a*b = " + (a*b));
        System.out.println("a/b = " + (a/b));
        System.out.println("a%b = " + (a%b));

    }
}
