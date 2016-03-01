package com.twu.book;


import com.twu.model.AuthorName;
import com.twu.model.BookName;
import com.twu.model.PublicationYear;

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

    public void setAvaliableBook(boolean avaliable){
        this.isAvaliable = avaliable;
    }

    public boolean isAvaliable(){
        return isAvaliable;
    }


}
