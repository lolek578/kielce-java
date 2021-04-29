package edu.kielce.exam1.versionA;

import java.util.Scanner;

public class ExamArray {
    Scanner scanner = new Scanner(System.in);
    private final int sizeOfArray;
    private int[] array;

    public ExamArray(int sizeOfArray) {
        this.sizeOfArray = sizeOfArray;
        array = new int[sizeOfArray];
    }

    //user type values into array
    public void insertToArray() {
        System.out.println("Set values into array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
    }

    //print array on screen, 5 values in row
    public void printArray() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
            if((i + 1) % 5 == 0){
                System.out.print("\n");
            }
        }
    }

    //count average of values in array
    public double averageOfArray() {
        double sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum / array.length;
    }
}

