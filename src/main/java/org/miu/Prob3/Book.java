package org.miu.Prob3;

import java.util.Objects;

class Book {
    private String ISBN;
    private String title;
    private String author;
    private boolean isBorrowed;

    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }
    public String getISBN() {
        return ISBN;
    }
    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }
    public boolean isBorrowed() {
        return isBorrowed;
    }
    @Override
    public String toString() {
        return "Book{ISBN='" + ISBN + "', title='" + title + "', author='" + author + "', isBorrowed=" + isBorrowed + "}";
    //my jdk complaining string concatenation is a preview feature
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(ISBN, book.ISBN);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(ISBN);
    }
}
