package edu.kielce.lab8;

public class Wind extends Instrument{
    public void play(Note n) {
        System.out.println("Wind.play()" + n);
    }

    public String what(){
        return "wind";
    };

    public void adjust(){
        System.out.println("Wind adjust");
    };
}
