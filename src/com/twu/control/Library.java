package com.twu.control;


import com.twu.model.bookLibrary.BookLibrary;
import java.util.ArrayList;

public class Library {
    private ArrayList<BookLibrary> availableBooksList = new ArrayList<>();


    public void createBooksList(ArrayList<BookLibrary> bookList){
        this.availableBooksList = bookList;
     }

    public void checkOutBook(int indexBook) throws NullPointerException {

        if (indexBook > availableBooksList.size()) {
            throw new NullPointerException("IndexBook Error");
        } else {
            availableBooksList.get(indexBook).setUnavailable();
        }
    }


    public void checkInBook(int indexBook) {
        availableBooksList.get(indexBook).setAvailable();
    }


    public void showLibraryBooks(boolean isAvailable) {
         this.availableBooksList.forEach(book -> {
            if (((book.isAvailable()) == (isAvailable))) {
                System.out.println(availableBooksList.indexOf(book) + " - " + book.toString());
            }});
    }


    public String bookDetail(int indexBook) {
        return this.availableBooksList.get(indexBook).getBookDetail();

    }
}