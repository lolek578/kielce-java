package edu.kielce.lab4;

import java.util.Scanner;

public class ArrayMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Set array size: ");
        int arraySize = scanner.nextInt();
        Array myArray = new Array(arraySize);

        myArray.setArray();
        System.out.println("===========");
        myArray.printArray();
        System.out.println("\n===========");
        System.out.println("AVG = "+ myArray.getAvg());
        System.out.println("===========");
        System.out.println("MAX = " + myArray.max());
        System.out.println("MIN = " + myArray.min());
        System.out.println("===========");
        myArray.bubbleSort();
        myArray.printArray();

    }
}
