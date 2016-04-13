package com.twu.menu.menu;

import com.twu.IO.MessagePrinter;
import com.twu.IO.ScannerInputUser;
import com.twu.control.Library;
import com.twu.control.ManagementUser;
import com.twu.menu.*;
import com.twu.provider.LibraryItems;

import java.util.HashMap;
import java.util.Map;

public class MenuOptions {
    private Library library;
    private ScannerInputUser scannerInputUser;
    private MessagePrinter messagePrinter;
    private BookListMenu bookListMenu;
    private MovieListMenu movieListMenu;
    private LoginMenu loginMenu;
    private ReturnItemMenu returnItemMenu;
    private UserInfoMenu userInfoMenu;
    private ItemsToReturnMenu itemsToReturnMenu;
    private LendItemMenu lendItemMenu;

    public MenuOptions(ScannerInputUser scannerInputUser, MessagePrinter messagePrinter) {
        this.library = new Library(new LibraryItems().createItemListLibrary(), new ManagementUser());
        this.scannerInputUser = scannerInputUser;
        this.messagePrinter = messagePrinter;
        initMenuOption(library);
    }

    public void menuOption(String option) {

        Map<String, Menu> map = new HashMap<>();
        map.put("1", new BookListMenu(library, messagePrinter));
        map.put("2", new MovieListMenu(library, messagePrinter));
        map.put("3", new LendItemMenu(library, messagePrinter, scannerInputUser));
        map.put("4", new ReturnItemMenu(library, messagePrinter, scannerInputUser));
        map.put("5", new UserInfoMenu(library, messagePrinter));
        map.put("Q", new MovieListMenu(library, messagePrinter));

        map.get(option).execute();


        switch (option) {

            case "1":
                bookListMenu.execute();
                break;

            case "2":
                movieListMenu.execute();
                break;

            case "3":
                lendItemMenu.execute();
            break;

            case "4":
                returnItemMenu.execute();
                break;

            case  "5":
                userInfoMenu.execute();
                break;

            case "Q":
                messagePrinter.print("Exit of System");
                break;

            default:
                messagePrinter.print("Select a valid option!");
                break;
        }
    }

    private void initMenuOption(Library library){
        this.bookListMenu = new BookListMenu(library, messagePrinter);
        this.movieListMenu = new MovieListMenu(library, messagePrinter);
        this.loginMenu = new LoginMenu(library, messagePrinter, scannerInputUser);
        this.returnItemMenu = new ReturnItemMenu(library, messagePrinter, scannerInputUser);
        this.userInfoMenu = new UserInfoMenu(library, messagePrinter);
        this.itemsToReturnMenu = new ItemsToReturnMenu(library, messagePrinter);
        this.lendItemMenu = new LendItemMenu(library, messagePrinter,scannerInputUser);

    }

     public boolean userLogin(){
        loginMenu.execute();

        return loginMenu.isUserAuthenticated();
    }
}
