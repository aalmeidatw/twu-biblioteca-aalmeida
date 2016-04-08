package com.twu.control;



import com.twu.types.Name;
import com.twu.types.itemType.ItemType;
import com.twu.types.book.Book;
import com.twu.types.library.ItemLibrary;
import com.twu.types.movie.Movie;
import com.twu.types.user.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Library {
    private List<ItemLibrary> libraryItems = new ArrayList<>();
    private ManagementUser managementUser;
    private User userAuthenticated;



    public Library(List<ItemLibrary> libraryItems){
        this.libraryItems = libraryItems;
        this.managementUser = new ManagementUser();
    }


    public boolean loginUser(String user_name, String password){
        return managementUser.loginUser(user_name, password);
    }

    public List<ItemLibrary> returnItemList(ItemType itemType){

        if(isBook(itemType)){
            return getBookList();

        }else if(isMovie(itemType)){
            return getMovieList();
        }

        return libraryItems;
    }

    public void setUserAuthenticated(User user){
        this.userAuthenticated = new User(new Name(user.getName()),
                                new NameLoginUser(user.getUserName()),
                                new PasswordUser(user.getPassword()),
                                new EmailUser(user.getEmail()),
                                new PhoneNumberUser(user.getPhoneNumber())
        );

    }

    protected boolean isMovie(ItemType itemType) {
        return itemType.equals(ItemType.MOVIE);
    }

    protected boolean isBook(ItemType itemType) {
        return itemType.equals(ItemType.BOOK);
    }

    private List<ItemLibrary> getBookList() {
        return libraryItems.stream()
                           .filter(itemLibrary -> itemLibrary.getItem() instanceof Book)
                           .collect(Collectors.toList());
    }

    private List<ItemLibrary> getMovieList() {
        return libraryItems.stream()
                           .filter(itemLibrary -> itemLibrary.getItem() instanceof Movie)
                           .collect(Collectors.toList());
    }

    public void lendItem(String name){
        ItemLibrary item = getLibraryItem(name);
        item.modifyAvailableItemStatus(false);
    }

    public void returnItem(String name){
        ItemLibrary item = getLibraryItem(name);
        item.modifyAvailableItemStatus(true);
    }

    protected ItemLibrary getLibraryItem(String name) {
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

    public String getUserInfo(){
        return userAuthenticated.getName() + " \n" +
                userAuthenticated.getUserName() + " \n" +
                userAuthenticated.getEmail() + " \n" +
                userAuthenticated.getPhoneNumber() + " \n";
    }

    public User getUser(String userName){
        return managementUser.getUser(userName);
    }


}