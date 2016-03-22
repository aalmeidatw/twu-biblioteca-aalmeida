package com.twu.provider;


import com.twu.control.ItemLibrary;
import com.twu.model.book.AuthorName;
import com.twu.model.book.Book;
import com.twu.model.item.Item;
import com.twu.model.item.Name;
import com.twu.model.item.PublicationYear;
import com.twu.model.movie.DirectorName;
import com.twu.model.movie.Movie;

import java.util.ArrayList;

public class ItemListLibrarySetup {

    private ArrayList<Item> itemsList = new ArrayList<>();
    private ArrayList<ItemLibrary> availableItemsLibrary = new ArrayList<>();

    public ArrayList<ItemLibrary> createItemListLibrary(){

        Item book1 = new Book(new Name("In Search of Lost Time"), new PublicationYear(1913), new AuthorName("Marcel Proust"));
        Item book2 = new Book(new Name("Moby Dick"), new PublicationYear(1851), new AuthorName("Herman Melville"));
        Item book3 = new Book(new Name("Ulysses"), new PublicationYear(1904), new AuthorName("James Joyce"));

        Item movie1 = new Movie(new Name("Mad Max"), new PublicationYear(2004), new DirectorName("George Miller"), 5);
        Item movie2 = new Movie(new Name("Spotlight"), new PublicationYear(2002), new DirectorName("Tom McCarthy"), 5);
        Item movie3 = new Movie(new Name("Inside Out"), new PublicationYear(2001), new DirectorName("Ronnie del Carmen"), 7);


        itemsList.add(book1);
        itemsList.add(book2);
        itemsList.add(book3);
        itemsList.add(movie1);
        itemsList.add(movie2);
        itemsList.add(movie3);


        this.itemsList.forEach(item -> {
            availableItemsLibrary.add(new ItemLibrary(item));
        });


        return availableItemsLibrary;
}






}
