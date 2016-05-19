package com.twu.bookModel;

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

    public boolean isAvailable(){
        return isAvailable;
    }

    public void setAvailableBook(boolean status) {
        this.isAvailable = status;
    }
}
