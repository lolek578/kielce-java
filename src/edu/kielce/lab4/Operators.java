package edu.kielce.lab4;

public class Operators {
    public static void main(String[] args) {
        //logic operators
        System.out.println("true && true: " + (true&&true));
        System.out.println("true || true: " + (true||true));
        System.out.println("true != true: " + (true!=true));

        //variables for test
        String text1 = new String("Lorem ipsum");
        String text2 = new String("Lorem ipsum");
        Integer number1 = 7;
        Integer number2 = 7;

        //numbers comparing
        System.out.println("=============");
        System.out.println("number1 = " + number1);
        System.out.println("number2 = " + number2);
        System.out.println("number1 == number2: " + (number1==number2));
        System.out.println("number1.equals(number2): " + (number1.equals(number2)));

        //text comparing
        System.out.println("=============");
        System.out.println("text1: "  +text1);
        System.out.println("text2: " + text2);

        System.out.println("text1 == text2: " + (text1==text2)); //checking reference to the object
        System.out.println("text1.equals(text2): " + (text1.equals(text2))); //comparing values


    }
}
