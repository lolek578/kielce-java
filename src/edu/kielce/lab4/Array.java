package edu.kielce.lab4;

import java.util.Scanner;

public class Array {
    int size;
    int[] array;
    Scanner scanner = new Scanner(System.in);

    public Array(int size) {
        this.size = size;
        this.array = new int[size];
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setArray(){
        for(int i = 0; i < size; i++){
            System.out.print("Set value: ");
            int value = scanner.nextInt();
            array[i] = value;
        }
    }

    public void printArray(){
        for(int index : array){
            System.out.print(index + " ");
        }
    }

    public double getAvg(){
        int sum = 0;
        for(int x : array){
            sum += x;
        }
        return sum / size;
    }

    public int max(){
        int max = array[0];
        for(int x : array){
            if(x > max){
                max = x;
            }
        }
        return max;
    }

    public int min(){
        int min = array[0];
        for(int x : array){
            if(x < min){
                min = x;
            }
        }
        return min;
    }

    public int[] bubbleSort(){
        for (int i = 0; i < size-1; i++)
            for (int j = 0; j < size-i-1; j++)
                if (array[j] > array[j+1])
                {
                    // swap arr[j+1] and arr[j]
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
        return array;
    }
}

