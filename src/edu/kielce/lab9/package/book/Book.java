package edu.kielce.lab9.ksiazkapakiet;

import java.time.Year;

public class Book {
    protected   String title, author;
    protected Year year;

    public Book(String title, String author, Year year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public void info(){
        System.out.println(title + " " + author + " " + year);
    }
}
