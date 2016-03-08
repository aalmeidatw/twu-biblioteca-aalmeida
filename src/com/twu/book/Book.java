package com.twu.book;


import com.twu.model.AuthorName;
import com.twu.model.BookName;
import com.twu.model.PublicationYear;

public class Book {
    private BookName bookName;
    private AuthorName authorName;
    private PublicationYear publicationYear;
    private boolean isAvailable;


    public Book (BookName bookName, AuthorName authorName, PublicationYear publicationYear, boolean isReserved){
        this.bookName = bookName;
        this.authorName = authorName;
        this.publicationYear = publicationYear;
        this.isAvailable = isReserved;
    }

    public String getBookName(){return bookName.getBookName();}

    public String getAuthorName(){
        return authorName.getAuthorName();
    }

    public int getPublicationYear(){
        return publicationYear.getPublicationYear();
    }


    public void setBookIsAvailable(){
        this.isAvailable = true;
    }

    public void setBookIsNotAvailable(){
        this.isAvailable = false;
    }

    public boolean isAvailable(){
        return isAvailable;
    }


}
