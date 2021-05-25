package edu.kielce.lab9.ksiazkapakiet;

import java.time.Year;

public class BookMain {
    public static void main(String[] args) {
      edu.kielce.lab9.ksiazkapakiet.Book[] arrayOfBooks = {
              new edu.kielce.lab9.ksiazkapakiet.Book("Potop", "Sienkiewicz", Year.of(1886)),
              new edu.kielce.lab9.ksiazkapakiet.Book("Jamiol", "Sienkiewicz", Year.of(1882)),
              new edu.kielce.lab9.ksiazkapakiet.Book("Sachem", "Sienkiewicz", Year.of(1889)),
              new edu.kielce.lab9.ksiazkapakiet.Book("Orso", "Sienkiewicz", Year.of(1880)),
      };

      for(int i = 0; i < arrayOfBooks.length; i++){
          arrayOfBooks[i].info();
      }
    }
}
