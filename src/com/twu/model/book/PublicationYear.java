package com.twu.model.book;


public class PublicationYear {
    private int publicationYear;


    public PublicationYear(int publicationYear){
        this.publicationYear = publicationYear;
    }

    public final int getPublicationYear(){
        return this.publicationYear;
    }
}
