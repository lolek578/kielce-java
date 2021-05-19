package edu.kielce.lab8;

public class Percussion extends Instrument{
    public void play(Note n) {
        System.out.println("Percussion.play()" + n);
    }

    public String what(){
        return "percussion";
    };

    public void adjust(){
        System.out.println("Percussion adjust");
    };
}
