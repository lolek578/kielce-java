package edu.kielce.lab8;

public class MusicTest3 {
    public  static void tuneOne(Instrument instrument){
        System.out.println(instrument.what());
        instrument.adjust();
    }

    public static void tuneAll(Instrument[] instrument){
        for(int i = 0; i < instrument.length; i++){
            tuneOne(instrument[i]);
        }
    }

    public static void main(String[] args) {
        Instrument[] instrumentsArray = {
                new Stringed(),
                new Brass(),
                new Wind(),
                new Woodwind()
        };

        tuneAll(instrumentsArray);
    }
}
