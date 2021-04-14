package edu.kielce.lab4;

public class LoopsAndInstructions {
    public static void main(String[] args) {


        forLoop();
        System.out.println("------------------");
        fizzBuzz();
        System.out.println("------------------");
        breakExample();
        System.out.println("------------------");
        continueExample();
        forEachExample();
        System.out.println("");
        argumentExample();

    }

    static void argumentExample(){
        int price = 10;
        String name = "John";

        int newPrice = name == "John" ? price * 10 : price * 5;

        System.out.println("NOwa cena to = " + newPrice);

    }

    static void forEachExample(){
        int[] array = {100, 101, 102, 103, 104, 105};

        for(int x:array){
            System.out.print(x + " ");
        }
    }


    static void continueExample(){
        for(int i = 100; i < 111; i++){
         if(i == 107){
             System.out.println("Tutaj powinno być 107");
             continue;
         }
            System.out.println(i);
        }
    }

    static void breakExample(){
        int i = 1;

        do{
            if(i % 7 == 0){
                break;
            }
            System.out.println(i);
            i++;
        }while(i < 11);

    }

    static void fizzBuzz() {
        int i = 1;
        while (i < 31) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            }else {
                System.out.println(i);
            }
            i++;
        }
    }


    static void forLoop(){
        int counter = 0;
        for(int i = 1; i < 11; i++){
            if(i % 3 == 0){
                counter++;
            }
        }
        System.out.println("W zakresie od 1 do 10 jest " + counter + " liczb podzielnych przez 3");
    }
}
