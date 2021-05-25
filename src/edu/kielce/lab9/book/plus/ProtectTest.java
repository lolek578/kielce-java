package edu.kielce.lab9.book.plus;

import edu.kielce.lab9.ksiazkapakiet.Book;
import java.time.Year;

public class ProtectTest {
    public static void main(String[] args) {
        Book[] arrayOfBooks = {
                new Book("Potop", "Sienkiewicz", Year.of(1886)),
                new Book("Jamiol", "Sienkiewicz", Year.of(1882)),
                new Book("Sachem", "Sienkiewicz", Year.of(1889)),
                new Book("Orso", "Sienkiewicz", Year.of(1880)),
        };

        for(int i = 0; i < arrayOfBooks.length; i++){
            arrayOfBooks[i].info();
        }
    }
}
