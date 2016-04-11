package com.twu.libraryApp;
import com.twu.IO.MenuOptions;
import com.twu.IO.MessagePrinter;
import com.twu.IO.ScannerInputUser;

public class LibraryApp {

    public static void main(String[] args) {

        MessagePrinter messagePrinter = new MessagePrinter();
        ScannerInputUser scannerInputUser = new ScannerInputUser();
        MenuOptions menu = new MenuOptions(scannerInputUser, messagePrinter);

        String option;
        messagePrinter.welcomeMessage();

        if (menu.userLogin()) {

            do {
                messagePrinter.showMenuOptions();
                option = scannerInputUser.getUserInfoScanner();
                menu.menuOption(option);

            } while (!option.equals("Q"));
        } else {
            messagePrinter.messagePrinterOnConsole("LOGIN FAIL - SYSTEM IS OUT!");

        }
    }

}
