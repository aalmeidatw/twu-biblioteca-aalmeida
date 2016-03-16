package com.twu.libraryApp;
import com.twu.IO.MenuOptions;
import com.twu.IO.PrinterMessage;
import com.twu.IO.ScannerInputUser;

public class LibraryApp {

    public static void main(String[] args) {

        PrinterMessage printerMessage = new PrinterMessage();
        ScannerInputUser scannerInputUser = new ScannerInputUser();
        MenuOptions menu = new MenuOptions();


        String option;
        printerMessage.welcomeMessage();

        do {
            printerMessage.showMenuOptions();
            option = scannerInputUser.getUserInfoScanner();
            menu.menuOption(option);


        }while (!option.equals("Q"));

    }
}
