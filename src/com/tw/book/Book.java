package com.tw.book;


import model.AuthorName;
import model.BookName;
import model.PublicationYear;

public class Book {
    private BookName bookName;
    private AuthorName authorName;
    private PublicationYear publicationYear;
    private boolean isAvaliable;


    public Book (BookName bookName, AuthorName authorName, PublicationYear publicationYear, boolean isAvaliable){
        this.bookName = bookName;
        this.authorName = authorName;
        this.publicationYear = publicationYear;
        this.isAvaliable = isAvaliable;
    }

    public String getBookName(){return bookName.getBookName();}

    public String getAuthorName(){
        return authorName.getAuthorName();
    }

    public int getPublicationYear(){
        return publicationYear.getPublicationYear();
    }

    public boolean isAvaliable(){
        return isAvaliable;
    }


}
