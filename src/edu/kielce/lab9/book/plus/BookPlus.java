package edu.kielce.lab9.book.plus;

import edu.kielce.lab9.ksiazkapakiet.Book;
import java.time.Year;

public class BookPlus extends Book {
    private String publisher;
    public BookPlus(String title, String author, Year year, String publisher) {
        super(title, author, year);
        this.publisher = publisher;
    }
}
