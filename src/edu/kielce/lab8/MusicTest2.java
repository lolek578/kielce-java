package edu.kielce.lab8;

public class MusicTest2{
    public static void main(String[] args) {

        Wind wind1 = new Wind();
        Brass brass1 = new Brass();

        wind1.play(new Note("Do"));
        brass1.play(new Note("RE"));

    }
}
