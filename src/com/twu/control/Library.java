package com.twu.control;


import com.twu.model.bookLibrary.BookLibrary;
import java.util.ArrayList;

public class Library {


    public void checkOutBook(ArrayList<BookLibrary> availableBooksList, int indexBook) throws NullPointerException {

        if (indexBook > availableBooksList.size()){
            throw new NullPointerException("IndexBook Error");
        } else {
            availableBooksList.get(indexBook).setUnavailable();
        }
     }


    public void checkInBook(ArrayList<BookLibrary> availableBooksList, int indexBook){
        availableBooksList.get(indexBook).setAvailable();
    }

}
