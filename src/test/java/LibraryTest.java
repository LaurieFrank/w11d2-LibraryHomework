import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;

    @Before
    public void before(){
        library = new Library(3);
//        book = new Book();
    }

    @Test
    public void countBooksInLibrary(){
        assertEquals(0, library.bookCount());
    }

    @Test
    public void addBookToLibrary(){
        library.addBook(book);
        assertEquals(1, library.bookCount());
    }
}
