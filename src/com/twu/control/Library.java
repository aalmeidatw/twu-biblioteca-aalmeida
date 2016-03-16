package com.twu.control;


import com.twu.model.book.Book;
import com.twu.model.bookData.AuthorName;
import com.twu.model.bookData.BookName;
import com.twu.model.bookData.PublicationYear;
import java.util.ArrayList;

public class Library {
    private ArrayList<Book> myBooks;
    private ArrayList<Book> availableBooks = new ArrayList<>();
    private ArrayList<Book> booksToReturn = new ArrayList<>();
    private Book myBook;

    public Library(ArrayList<Book> myBooks){
        this.myBooks = myBooks;
    }

    public void setBookAsAvailable(String bookName){
        myBooks.forEach(book -> {
                if(book.getBookName().equals(bookName)){
                    book.setBookIsAvailable();

                }});
    }


    public void checkOutBook(String bookName){
        Book selectedBook = returnBookAsList(bookName);
        markBookAsReserved(selectedBook);
     }


    private Book returnBookAsList(String bookName){
            this.availableBooks.forEach(book -> {

                if(book.getBookName().equals(bookName)){
                    myBook = book;
                    return;
                }

            });

        return myBook;
    }


    public ArrayList<Book> getAvailableBooksList(){
        this.myBooks.forEach(book ->{
            if(book.isAvailable()){
                this.availableBooks.add(book);
            }
        });
     return this.availableBooks;
    }

    private void markBookAsReserved(Book myBook){
         myBook.setBookIsNotAvailable();
    }

    public Book getBookForDetail(int value){
        String bookName = getNameAtBook(value);

       this.availableBooks.forEach(book -> {
                if(book.getBookName().equals(bookName)){
                    this.myBook =  new Book(new BookName(book.getBookName()),new AuthorName(book.getAuthorName()), new PublicationYear(book.getPublicationYear()), true);
                }});
        return myBook;
    }


    private String getNameAtBook(int value){
        return this.availableBooks.get(value).getBookName();
    }

    public ArrayList<Book> getListOfBooksToReturn(){
        this.myBooks.forEach(book ->{
            if(!book.isAvailable()){
                this.booksToReturn.add(book);
            }
        });
        return this.booksToReturn;
    }













}
