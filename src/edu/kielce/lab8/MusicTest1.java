package edu.kielce.lab8;

public class MusicTest1 {
    public static void tune(Instrument i) {
        i.play(new Note(" Middle C"));
    }
    public static void main(String[] args) {
        Wind w = new Wind();
        tune(w);
    }
}

