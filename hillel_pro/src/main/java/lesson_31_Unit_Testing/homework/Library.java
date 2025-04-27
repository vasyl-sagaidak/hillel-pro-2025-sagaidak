package lesson_31_Unit_Testing.homework;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private final List<Book> catalog;

    public Library() {
        catalog = new ArrayList<>();
    }

    public void addBook(Book book) {
        if (nullAndEmptyCheck(book)) {
            catalog.add(book);
        } else {
            throw new IllegalArgumentException("Please make sure that book object is not null, " +
                    "and also that you specified it's title and author");
        }
    }

    public boolean removeBook(Book book) {
        if(book != null && catalog.contains(book)) {
            catalog.remove(book);
            return true;
        }
        return false;
    }

    public List<Book> getBooks() {
        return catalog;
    }

    public int getBookCount() {
        return catalog.size();
    }

    private boolean nullAndEmptyCheck(Book book) {
        if (book == null) {
            return false;
        } else if (book.getTitle() == null || book.getTitle().isEmpty()) {
            return false;
        } else if (book.getAuthor() == null || book.getAuthor().isEmpty()) {
            return false;
        }
        return true;
    }
}
