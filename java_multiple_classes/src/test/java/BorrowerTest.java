import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Book book;
    Library library;

    @Before
    public void before() {
        borrower = new Borrower("Maria");
        book = new Book();
        library = new Library("Favourites", 5);
        library.addItem(book);
    }

    @Test
    public void collectionStartsEmpty() {
        assertEquals(0, borrower.booksCount());
    }

    @Test
    public void canAddBook() {
        borrower.add(book);
        assertEquals(1, borrower.booksCount());
    }

    @Test
    public void canBorrowBookFromLibrary() {
        borrower.borrowBookFromLibrary(library);
        assertEquals(1, borrower.booksCount());
        assertEquals(0, library.bookCount());
    }



}
