package org.miu.Prob3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class Library {
    private HashMap<String,Book> libraryHashMap=new HashMap<>();

    public void addBook(String ISBN, String title, String author){
        if(ISBN==null||title==null||author==null||ISBN.isEmpty()||title.isEmpty()||author.isEmpty()) throw new IllegalArgumentException("Input cannot be null or empty");
        Book newBook=new Book(ISBN,title,author);
        if(libraryHashMap.containsKey(ISBN)){
            System.out.println("Book already exists");
        }else{
            libraryHashMap.put(ISBN,newBook);
            System.out.println("Book successfully added");
        }

    }

    public void borrowBook(String ISBN){
        if(bookExists(ISBN)){
            Book book=libraryHashMap.get(ISBN);
            if(!book.isBorrowed()){
                book.setBorrowed(true);
                System.out.println("Book borrow successful");
            }else{
                System.out.println("Book already borrowed");
            }

        }else{
            System.out.println("No such book in library");
        }
    }
    public void returnBook(String ISBN){
        if(bookExists(ISBN)){
            Book book=libraryHashMap.get(ISBN);
            if(book.isBorrowed()){
                book.setBorrowed(false);
                System.out.println("Book return successful");
            }else{
                System.out.println("This book has not been borrowed");
            }
        }else{
            System.out.println("No such book in library");
        }
    }
    public boolean isBorrowed(String ISBN){
        if(bookExists(ISBN)) {
            Book book = libraryHashMap.get(ISBN);
            return book != null && book.isBorrowed();
        }
        return false;
    }
    public void getBookDetails(String ISBN) {
        if(bookExists(ISBN)){
            Book book = libraryHashMap.get(ISBN);
            if (book != null) {
                System.out.println(book);
            } else {
                System.out.println("No such book in library");
            }
        }
    }
    public void listAllBooks(){
        if(libraryHashMap.isEmpty()){
            System.out.println("No books in the library");
            return;
        }
        Collection<Book> booklist=libraryHashMap.values();
        Iterator<Book> it=booklist.iterator();
        while(it.hasNext()){
            Book book=it.next();
            System.out.println(book);
        }
    }
    public void listBorrowedBooks(){
        if(libraryHashMap==null||libraryHashMap.size()==0) return;
        Collection<Book> booklist=libraryHashMap.values();
        Iterator<Book> it=booklist.iterator();
        while(it.hasNext()){
            Book book = it.next();
            if(book.isBorrowed()){
                System.out.println(book);
            }
        }
    }
    public boolean bookExists(String ISBN){
        if (ISBN == null || ISBN.isEmpty()) {
            throw new IllegalArgumentException("ISBN cannot be null or empty");
        }
        return libraryHashMap.containsKey(ISBN);
    }
}
