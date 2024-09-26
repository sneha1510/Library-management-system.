package org.example;

/*import static org.junit.jupiter.api.Assertions.*;

class LibraryManagementSystemTest
{

}*/

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    private Library library;

    @BeforeEach
    void setUp() {
        library = new Library();
    }

    @Test
    void testAddBook() {
        // Add a book and verify it is added successfully
        library.addBook("12345", "Test Book", "Test Author", 2020);
        assertEquals(1, library.getBooks().size(), "Book should be added to the library");
        assertEquals("Test Book", library.getBooks().get(0).title, "Book title should match");
    }

    @Test
    void testBorrowBookAvailable() {
        // Add and then borrow a book
        library.addBook("12345", "Test Book", "Test Author", 2020);
        library.borrowBook("12345");

        // Check if the book is borrowed
        assertFalse(library.getBooks().get(0).isAvailable, "Book should be marked as unavailable after being borrowed");
    }

    @Test
    void testBorrowBookNotAvailable() {
        // Add a book and try to borrow it twice
        library.addBook("12345", "Test Book", "Test Author", 2020);
        library.borrowBook("12345");
        library.borrowBook("12345");

        // The second borrow should not work as the book is already borrowed
        assertFalse(library.getBooks().get(0).isAvailable, "Book should remain unavailable after trying to borrow it again");
    }

    @Test
    void testBorrowBookNotFound() {
        // Try to borrow a book that doesn't exist
        library.borrowBook("99999");

        // No exception is thrown, but the book is not found
        // You can also handle a custom exception if you modify the borrowBook method accordingly
    }

    @Test
    void testReturnBook() {
        // Add and borrow a book, then return it
        library.addBook("12345", "Test Book", "Test Author", 2020);
        library.borrowBook("12345");
        library.returnBook("12345");

        // Check if the book is returned successfully
        assertTrue(library.getBooks().get(0).isAvailable, "Book should be available after being returned");
    }

    @Test
    void testReturnBookNotBorrowed() {
        // Try returning a book that was never borrowed
        library.addBook("12345", "Test Book", "Test Author", 2020);
        library.returnBook("12345");

        // The book should still be available since it wasn't borrowed
        assertTrue(library.getBooks().get(0).isAvailable, "Book should remain available after returning a non-borrowed book");
    }

    @Test
    void testViewAvailableBooks() {
        // Add a few books and check availability
        library.addBook("12345", "Test Book 1", "Author 1", 2020);
        library.addBook("67890", "Test Book 2", "Author 2", 2021);

        // Borrow one book
        library.borrowBook("12345");

        // Ensure only the available book is listed
        assertEquals(1, library.getAvailableBooks().size(), "Only one book should be available after borrowing one");
        assertEquals("Test Book 2", library.getAvailableBooks().get(0).title, "The available book should be 'Test Book 2'");
    }
}
