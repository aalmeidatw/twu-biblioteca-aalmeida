package com.twu.IO;

import com.twu.control.Library;
import com.twu.menu.*;
import com.twu.provider.LibraryItems;

public class MenuOptions {
    private Library library;
    private ScannerInputUser scannerInputUser;
    private MessagePrinter messagePrinter;
    private BookListMenu bookListMenu;
    private MovieListMenu movieListMenu;
    private LoginMenu loginMenu;
    private ReturnItemMenu returnItemMenu;
    private UserInfoMenu userInfoMenu;
    private ShowAllItemMenu showAllItemMenu;
    private LendItemMenu lendItemMenu;

    public MenuOptions(ScannerInputUser scannerInputUser, MessagePrinter messagePrinter) {
        this.library = new Library(new LibraryItems().createItemListLibrary());
        this.scannerInputUser = scannerInputUser;
        this.messagePrinter = messagePrinter;
        initMenuOption(library);
    }

    public void menuOption(String option) {


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


            case  "9":
                userInfoMenu.execute();
                break;


            case "Q":
                messagePrinter.messagePrinterOnConsole("Exit of System");
                break;

            default:
                messagePrinter.messagePrinterOnConsole("Select a valid option!");
                break;
        }

    }

    private void initMenuOption(Library library){
        this.bookListMenu = new BookListMenu(library);
        this.movieListMenu = new MovieListMenu(library);
        this.loginMenu = new LoginMenu(library);
        this.returnItemMenu = new ReturnItemMenu(library);
        this.userInfoMenu = new UserInfoMenu(library);
        this.showAllItemMenu = new ShowAllItemMenu(library);
        this.lendItemMenu = new LendItemMenu(library);

    }



    public boolean userLogin(){
        loginMenu.execute();

        return loginMenu.isUserAuthenticated();
    }
}
