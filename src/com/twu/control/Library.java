package com.twu.control;



import com.twu.types.book.Book;
import com.twu.types.library.ItemLibrary;
import com.twu.types.movie.Movie;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Library {
    private List<ItemLibrary> libraryItems = new ArrayList<>();
    private ManagementUser managementUser;
    private boolean userAuthenticated;

    public Library(List<ItemLibrary> libraryItems){
        this.libraryItems = libraryItems;
        this.managementUser = new ManagementUser();
        this.userAuthenticated = false;
    }


    public boolean isUserAuthenticated(String user_name, String password){
        return managementUser.loginUser(user_name, password);
    }

    public void setUserAuthenticated(boolean status){
        this.userAuthenticated = status;
    }


    public List<ItemLibrary> returnBookList(){

        List<ItemLibrary> libraryBooks = new ArrayList<>();

        libraryItems.forEach(itemLibrary -> {
                if(itemLibrary.getItem() instanceof Book){
                    libraryBooks.add(itemLibrary);
                }
        });

        return libraryBooks;
   }


    public List<ItemLibrary> returnMovieList(){

        List<ItemLibrary> libraryMovies = new ArrayList<>();

        libraryItems.forEach(itemLibrary -> {
            if(itemLibrary.getItem() instanceof Movie){
                libraryMovies.add(itemLibrary);
            }
        });

        return libraryMovies;
    }


    public void lendItem(String name){
        ItemLibrary item = getLibraryItem(name);
        item.modifyAvailableItemStatus(false);
    }

    public void returnItem(String name){
        ItemLibrary item = getLibraryItem(name);
        item.modifyAvailableItemStatus(true);
    }

    public ItemLibrary getLibraryItem(String name) {
        Optional<ItemLibrary> result = findLibraryItem(name);
        return result.orElse(null);
    }

    public boolean isItemAvailableToLend(String name){
        Optional<ItemLibrary> result = findLibraryItem(name);
        return  result.isPresent() && result.get().isAvailable();
    }

    private Optional<ItemLibrary> findLibraryItem(String name) {
        return libraryItems
                .stream()
                .filter(item -> compareItemName(item, name))
                .findFirst();
    }

    private boolean compareItemName(ItemLibrary itemLibrary, String name){
        return itemLibrary.getItem().getName().equals(name);
    }


}