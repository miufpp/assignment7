package org.miu.Prob3;

public class Test {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook("12345", "This is our chance", "James Ene Henshaw");
        library.addBook("67890", "1984", "George Orwell");

        library.listAllBooks();

        library.borrowBook("12345");
        library.listBorrowedBooks();

        library.returnBook("12345");
        library.listBorrowedBooks();

        library.getBookDetails("12345");
    }
}
