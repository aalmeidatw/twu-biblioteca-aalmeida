package com.twu.model.book;


import com.twu.model.item.PublicationYear;

public class Book {
    private BookName bookName;
    private AuthorName authorName;
    private PublicationYear publicationYear;


    public Book (BookName bookName, AuthorName authorName, PublicationYear publicationYear){
        this.bookName = bookName;
        this.authorName = authorName;
        this.publicationYear = publicationYear;
    }

    public String getBookName(){return bookName.getBookName();}

    public String getAuthorName(){
        return authorName.getAuthorName();
    }

    public int getPublicationYear(){
        return publicationYear.getPublicationYear();
    }

    @Override
    public String toString() {
        return "Book Name: " + bookName.getBookName() + "\n"
                + "Author Name: "  + authorName.getAuthorName() + "\n"
                +  "Publication Year: " + publicationYear.getPublicationYear()
                + "\n\n";
    }
}
