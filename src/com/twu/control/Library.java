package com.twu.control;



import com.twu.types.book.Book;
import com.twu.types.library.ItemLibrary;
import com.twu.types.movie.Movie;
import java.util.ArrayList;
import java.util.Optional;


public class Library {
    private ArrayList<ItemLibrary> itemsListInLibrary = new ArrayList<>();



    public void setLibraryItems(ArrayList<ItemLibrary> itemList){
        this.itemsListInLibrary = itemList;
    }



    public void lendItem(String name){

         ItemLibrary item = getLibraryItem(name);
         item.setIsNotAvailable();
    }


    public ArrayList<ItemLibrary> returnAllMovies(){
        ArrayList<ItemLibrary> movieList = new ArrayList<>();

        itemsListInLibrary.forEach(itemLibrary -> {
            if(isMovie(itemLibrary)){
                movieList.add(itemLibrary);
            }
        });
        return movieList;
    }

    public ArrayList<ItemLibrary> returnAllBooks(){
        ArrayList<ItemLibrary> bookList = new ArrayList<>();

        itemsListInLibrary.forEach(itemLibrary -> {
            if(isBook(itemLibrary)){
                bookList.add(itemLibrary);
            }
        });
        return bookList;
    }





    public ItemLibrary getLibraryItem(String name) {

        Optional<ItemLibrary> result = itemsListInLibrary
                                        .stream()
                                        .filter(item -> item.getItem().getName().equals(name))
                                        .findFirst();
        if (result.isPresent()) {
            return result.get();
        }
        return null;
    }



    public boolean isBook(ItemLibrary itemLibrary){
        return itemLibrary.getItem() instanceof Book;
    }

    public boolean isMovie(ItemLibrary itemLibrary){
        return itemLibrary.getItem() instanceof Movie;
    }


    public boolean isItemAvailableToLend(String name){

        Optional<ItemLibrary> result = itemsListInLibrary
                                         .stream()
                                         .filter(item -> compareItemName(item, name))
                                         .findFirst();

        if (result.isPresent() && (result.get().isAvailable() )) {
            return true;
        } else
            return false;

    }

    public boolean compareItemName(ItemLibrary itemLibrary, String name){
        return (  (itemLibrary.getItem().getName().equals(name) ) );
    }




    public boolean isItemIsNotAvailableToLend(ItemLibrary itemLibrary, String name){

        Optional<ItemLibrary> result = itemsListInLibrary
                .stream()
                .filter(item -> compareItemName(item, name))
                .findFirst();

        if (result.isPresent() && (result.get().isAvailable() )) {
            return true;
        } else
            return false;


    }

}