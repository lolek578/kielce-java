package edu.kielce.lab8;

public class Instrument {
    public void play(Note n) {
        System.out.println("Instrument.play() " +n);
    }

    public String what(){
        return "instrument";
    };

    public void adjust(){
        System.out.println("Adjust");
    };

}
