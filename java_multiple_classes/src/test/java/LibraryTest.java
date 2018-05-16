import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;

    @Before
    public void before() {
        library = new Library("Central Library", 10);
        book = new Book();
    }

    @Test
    public void canAddBook() {
        library.addItem(book);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void libraryCapacityFull() {
        library.addItem(book);
        assertEquals(false, library.fullCapacity());
    }

    @Test
    public void canGetBook() {
        library.addItem(book);
        library.removeItem();
        assertEquals(0, library.bookCount());
    }
}
