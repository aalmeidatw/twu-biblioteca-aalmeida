package com.twu.model.bookLibrary;


import com.twu.model.book.Book;
import java.util.ArrayList;

public class BookLibraryList {
    private ArrayList<BookLibrary> bookList = new ArrayList<>();



    public ArrayList<BookLibrary> createAvailableBookList(ArrayList<Book> books){

        books.forEach(book -> {
            addBookAtList(new BookLibrary(book, true));
        });
        return bookList;
    }


    private void addBookAtList(BookLibrary bookLibrary){
        bookList.add(bookLibrary);
    }



}



