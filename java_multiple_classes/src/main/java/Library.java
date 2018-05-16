import java.util.ArrayList;

public class Library {

    private String name;
    private ArrayList<Book> item;
    private int capacity;


    public Library(String name, int capacity) {
        this.name = name;
        this.item = new ArrayList<>();
        this.capacity = capacity;
    }

    public int bookCount() {
        return this.item.size();
    }

    public void addItem(Book book) {
        this.item.add(book);
    }

    public boolean fullCapacity() {
        return bookCount() == capacity;
    }

    public Book removeItem() {
        return this.item.remove(0);
    }
}
