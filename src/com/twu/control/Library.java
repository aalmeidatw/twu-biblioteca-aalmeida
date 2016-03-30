package com.twu.control;



import com.twu.types.library.ItemLibrary;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Library {
    private List<ItemLibrary> libraryItems = new ArrayList<>();
    private ManagementUser managementUser;


    public Library(List<ItemLibrary> libraryItems){
        this.libraryItems = libraryItems;
        this.managementUser = new ManagementUser();
    }

    public void lendItem(String name){
        ItemLibrary item = getLibraryItem(name);
        item.modifyAvailableItemStatus(false);
    }

    public void returnBorrowedItem(String name){
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