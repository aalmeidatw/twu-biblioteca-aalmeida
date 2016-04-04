package com.twu.IO;

import com.twu.control.Library;
import com.twu.control.ManagementUser;
import com.twu.menu.MenuLogin;
import com.twu.menu.MenuOption1;
import com.twu.menu.MenuOption2;
import com.twu.provider.LibraryItems;

public class MenuOptions {
    private Library library;
    //private ManagementUser managementUser;
    private ScannerInputUser scannerInputUser;
    private MessagePrinter messagePrinter;
    private MenuOption1 menuOption1;
    private MenuOption2 menuOption2;
    private MenuLogin menuLogin;



    public MenuOptions() {
        this.library = new Library(new LibraryItems().createItemListLibrary());
        this.scannerInputUser = new ScannerInputUser();
        this.messagePrinter = new MessagePrinter();
        this.menuOption1 = new MenuOption1(library);
        this.menuOption2 = new MenuOption2(library);
        this.menuLogin = new MenuLogin(library);
    }

    public void menuOption(String option) {


        switch (option) {

            case "1":
                menuOption1.execute();
                break;

            case "2":
                menuOption2.execute();
                break;



            case "Q":
                messagePrinter.messagePrinterOnConsole("Exit of System");
                break;

            default:
                messagePrinter.messagePrinterOnConsole("Select a valid option!");
                break;
        }

        }



    public boolean userLogin(){
        menuLogin.execute();

        return menuLogin.isUserAuthenticated();
    }
}
