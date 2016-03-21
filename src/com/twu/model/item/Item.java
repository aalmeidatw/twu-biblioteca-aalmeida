package com.twu.model.item;


public class Item {
    private Name name;
    private PublicationYear publicationYear;
    private String type;


    public Item(Name name, PublicationYear publicationYear, String type){
        this.name = name;
        this.publicationYear = publicationYear;
        this.type = type;
    }

    public String getName() {
        return name.getName();
    }

    public int getPublicationYear() {
        return publicationYear.getPublicationYear();
    }

    public String getType() {
        return type;
    }
}




