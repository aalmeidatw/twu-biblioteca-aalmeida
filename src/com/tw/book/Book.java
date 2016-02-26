package com.tw.book;


import model.AuthorName;
import model.PublicationYear;

public class Book {
    private AuthorName authorName;
    private PublicationYear publicationYear;
    private boolean isAvaliable;


    public Book (AuthorName authorName, PublicationYear publicationYear, boolean isAvaliable){
        this.authorName = authorName;
        this.publicationYear = publicationYear;
        this.isAvaliable = isAvaliable;
    }


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
