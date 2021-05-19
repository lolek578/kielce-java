package edu.kielce.lab8;

public class Brass extends Wind{
    public void play(Note n) {
        System.out.println("Brass.play() " +n);
    }

    public void adjust(){
        System.out.println("brass adjust");
    };

}
