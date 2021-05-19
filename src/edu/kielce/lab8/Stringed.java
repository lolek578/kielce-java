package edu.kielce.lab8;

public class Stringed extends Instrument{
    public void play(Note n) {
        System.out.println("Stringed.play()" + n);
    }

    public String what(){
        return "stringed";
    };

    public void adjust(){
        System.out.println("Stringed adjust");
    };
}
