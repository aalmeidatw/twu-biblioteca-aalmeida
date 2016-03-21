package com.twu.model.bookLibrary;


import com.twu.model.book.Book;

public class BookLibrary {
    private Book book;
    private boolean isAvailable;


    public BookLibrary(Book book, boolean isAvailable) {
        this.book = book;
        this.isAvailable = isAvailable;
    }

    public Book getBook(){
        return this.book;
    }

    public void setUnavailable(){
        this.isAvailable = false;
    }

    public void setAvailable(){
        this.isAvailable = true;
    }

    public boolean isAvailable(){
        return this.isAvailable;
    }

    @Override
    public String toString() {
        return "Book Name: " + book.getBookName();
     }

    public String getBookDetail(){
        return "Book Name: " + book.getBookName() + "\n" +
                "Author Name: " + book.getAuthorName() + "\n" +
                "Publication Year: " + book.getPublicationYear() + "\n\n";


    }
}
