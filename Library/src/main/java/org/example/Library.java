package org.example;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(String isbn, String title, String author, int publicationYear) {
        books.add(new Book(isbn, title, author, publicationYear));
        System.out.println("Book added successfully!");
    }

    public void borrowBook(String isbn) {
        for (Book book : books) {
            if (book.isbn.equals(isbn)) {
                if (book.isAvailable) {
                    book.isAvailable = false;
                    System.out.println("You have borrowed: " + book.title);
                    return;
                } else {
                    System.out.println("The book is currently unavailable.");
                    return;
                }
            }
        }
        System.out.println("Book with ISBN " + isbn + " not found.");
    }

    public void returnBook(String isbn) {
        for (Book book : books) {
            if (book.isbn.equals(isbn)) {
                if (!book.isAvailable) {
                    book.isAvailable = true;
                    System.out.println("You have returned: " + book.title);
                    return;
                } else {
                    System.out.println("This book was not borrowed.");
                    return;
                }
            }
        }
        System.out.println("Book with ISBN " + isbn + " not found.");
    }

    public void viewAvailableBooks() {
        System.out.println("Available Books:");
        for (Book book : books) {
            if (book.isAvailable) {
                System.out.println(book);
            }
        }
    }
    //helper methods for test cases
    // In Library class
    public List<Book> getBooks() {
        return books;
    }

    public List<Book> getAvailableBooks() {
        List<Book> availableBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.isAvailable) {
                availableBooks.add(book);
            }
        }
        return availableBooks;
    }

}