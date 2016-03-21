package com.twu.model.movie;


import com.twu.model.item.Item;
import com.twu.model.item.Name;
import com.twu.model.item.PublicationYear;

public class Movie extends Item {
    private DirectorName directorName;
    private String itemType;
    private  int rate;


    public Movie(Name name, PublicationYear publicationYear, DirectorName directorName, int rate){
        super(name, publicationYear);
        this.directorName = directorName;
        this.rate = rate;
    }

    public String getDirectorName() {
        return directorName.getDirectorName();
    }

    public String getItemType() {
        return itemType;
    }

    public int getRate() {
        return rate;
    }
}
