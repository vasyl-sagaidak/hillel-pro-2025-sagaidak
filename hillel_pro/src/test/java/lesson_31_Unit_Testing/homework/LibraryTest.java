package lesson_31_Unit_Testing.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LibraryTest {
    Library library;
    Book book1;
    Book book2;
    Book book3;

    @BeforeEach
    public void prepareData() {
        library = new Library();
        book1 = new Book("The Apology Of Socrates", "Plato");
        book2 = new Book("Alone With Myself", "Marcus Aurelius");
        book3 = new Book("Faust", "Goethe");
    }

    @Test
    public void testAddBook() {
        assertTrue(library.getBooks().isEmpty());
        library.addBook(book1);
        assertEquals(1, library.getBookCount());
        library.addBook(book2);
        library.addBook(book3);
        assertEquals(3, library.getBookCount());
    }

    @Test
    void testAddBookNullCases() {
       assertThrows(IllegalArgumentException.class, () -> {
           library.addBook(null);
       });
       assertThrows(IllegalArgumentException.class, () -> {
           library.addBook(new Book(null, "Test Author"));
       });
       assertThrows(IllegalArgumentException.class, () -> {
           library.addBook(new Book("Test Title", null));
       });
    }

    @Test
    void testAddEmptyCases() {
        assertThrows(IllegalArgumentException.class, () -> {
            library.addBook(new Book("", "Test Author"));
        });
        assertThrows(IllegalArgumentException.class, () -> {
            library.addBook(new Book("Test Title", ""));
        });
    }

    @Test
    public void testRemoveBook() {
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        assertTrue(library.removeBook(book3));
        assertFalse(library.removeBook(new Book("test", "test")));
    }

    @Test
    public void testGetBooksList() {
        library.addBook(book1);
        library.addBook(book2);
        List<Book> books = library.getBooks();
        assertNotNull(books);
        assertFalse(books.isEmpty());

    }

    @Test
    public void testGetBooksCount() {
        library.addBook(book1);
        assertEquals(1, library.getBookCount());
        library.addBook(book2);
        assertEquals(2,library.getBookCount());
    }
}