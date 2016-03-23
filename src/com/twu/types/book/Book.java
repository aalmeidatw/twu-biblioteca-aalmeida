package com.twu.types.book;


import com.twu.types.item.Item;
import com.twu.types.item.Name;
import com.twu.types.item.PublicationYear;

public class Book extends Item {
    private AuthorName authorName;
    private String itemType;


    public Book (Name name, PublicationYear publicationYear, AuthorName authorName){
        super(name, publicationYear);
        this.authorName = authorName;
        this.itemType = "Book";
    }

    public String getBookName(){
        return super.getName();
    }

    public String getAuthorName(){
        return authorName.getAuthorName();
    }

    public int getPublicationYear(){
        return super.getPublicationYear();
    }

    @Override
    public String toString() {
        return "Book Name: " + super.getName() + "\n"
                + "Author Name: "  + authorName.getAuthorName() + "\n"
                +  "Publication Year: " + super.getPublicationYear()
                + "\n\n";
    }
}
