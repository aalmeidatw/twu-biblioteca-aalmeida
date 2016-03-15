package com.twu.libraryApp;
import com.twu.menu.MenuOptions;
import com.twu.message.PrinterMessage;
import com.twu.scanner.ScannerInputUser;

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
