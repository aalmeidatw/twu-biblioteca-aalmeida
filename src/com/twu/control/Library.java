package com.twu.control;


import com.twu.bookModel.Book;
import com.twu.book.BookAlgorithm;
import com.twu.IO.ScannerInputUser;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> myBooks;
    private ArrayList<Book> availableBooks;
    private BookAlgorithm bookAlgorithm;
    private ScannerInputUser scannerInputUser = new ScannerInputUser();

    public Library(ArrayList<Book> myBooks){
        this.myBooks = myBooks;
    }

    public void returnBook(int value){
        myBooks.get(value).setBookIsAvailable();
    }





}
