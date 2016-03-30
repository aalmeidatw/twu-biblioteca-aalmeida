package com.twu.IO;

import com.twu.control.Library;
import com.twu.provider.LibraryItems;
import com.twu.provider.LibraryUsers;

public class MenuOptions {
    private Library library;
    private ScannerInputUser scannerInputUser;
    private MessagePrinter messagePrinter;


    public MenuOptions() {
        this.library = new Library(new LibraryItems().createItemListLibrary());
        this.scannerInputUser = new ScannerInputUser();
        this.messagePrinter = new MessagePrinter();
    }

    public void menuOption(String option) {


        switch (option) {

            case "1":
                messagePrinter.meessagePrinterOnConsole("List of Available Books! : ");

                break;


            case "Q":
                messagePrinter.meessagePrinterOnConsole("Exit of System");
                break;

            default:
                messagePrinter.meessagePrinterOnConsole("Select a valid option!");
                break;
        }

        }



    public boolean userLogin(){
        return true;



    }
}
