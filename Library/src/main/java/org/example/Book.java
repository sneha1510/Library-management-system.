package org.example;

class Book {
    String isbn;
    String title;
    String author;
    int publicationYear;
    boolean isAvailable;

    public Book(String isbn, String title, String author, int publicationYear) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.isAvailable = true; // New books are available by default
    }

    @Override
    public String toString() {
        return "ISBN: " + isbn + ", Title: " + title + ", Author: " + author +
                ", Year: " + publicationYear + ", Available: " + (isAvailable ? "Yes" : "No");
    }
}