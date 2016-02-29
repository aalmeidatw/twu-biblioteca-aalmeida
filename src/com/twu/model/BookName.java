package com.twu.model;


public class BookName {
    private String bookName;

    public BookName(String bookName){
        this.bookName = bookName;
    }

    public final String getBookName(){
        return this.bookName;
    }
}
