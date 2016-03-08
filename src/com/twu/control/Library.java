package com.twu.control;


import com.twu.book.Book;
import com.twu.model.AuthorName;
import com.twu.model.BookName;
import com.twu.model.PublicationYear;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> myBooks;
    private ArrayList<Book> availableBooks = new ArrayList<>();
    private ArrayList<Book> booksToReturn = new ArrayList<>();
    private Book myBook;

    public Library(ArrayList<Book> myBooks){
        this.myBooks = myBooks;
    }

    public void returnBook(String bookName){
        myBooks.forEach(book -> {
                if(book.getBookName().equals(bookName)){
                    book.setBookIsAvailable();
                }});
    }


    public ArrayList<Book> getAvailableBooksList(){
        this.myBooks.forEach(book ->{
            if(book.isAvailable()){
                this.availableBooks.add(book);
            }
        });
     return this.availableBooks;
    }

    public void markBookAsReserved(int value){
        String bookName = getNameAtBook(value);

        this.myBooks.forEach(book -> {
            if(book.getBookName().equals(bookName)){
                book.setBookIsNotAvailable();
             }});
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
