import java.util.ArrayList;

public class Borrower {
    private String name;
    private ArrayList<Book> collection;

    public Borrower(String name) {
        this.name = name;
        this.collection = new ArrayList<>();
    }

    public int booksCount() {
        return this.collection.size();
    }

    public void add(Book book) {
        this.collection.add(book);
    }

    public void borrowBookFromLibrary(Library library) {
        Book book = library.removeItem();
        this.add(book);
    }



}
