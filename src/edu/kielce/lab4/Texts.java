package edu.kielce.lab4;

public class Texts {
    public static void main(String[] args) {
        String aText = "5.12";
        String cText = "6";
        double aDOuble = Double.parseDouble(aText);
        float aFloat = Float.parseFloat(aText);
        long cLong = Long.parseLong(cText);
        int cInt = Integer.parseInt(cText);
        int b = 12;
        String bAsText = Integer.toString(b);

        System.out.println("b text = " + bAsText);
        System.out.println("a float = " + aFloat);
        System.out.println("a double = " + aDOuble);
        System.out.println("c long = " + cLong);
        System.out.println("c int = " + cInt);
    }
}
