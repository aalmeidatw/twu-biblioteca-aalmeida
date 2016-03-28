package com.twu.IO;

import com.twu.control.Library;
import com.twu.provider.LibraryItem;

public class MenuOptions {
    private Library library;
    private ScannerInputUser scannerInputUser;
    private MessagePrinter messagePrinter;


    public MenuOptions(){
        this.library = new Library();
        library.setLibraryItems(new LibraryItem().createItemListLibrary());
        this.scannerInputUser = new ScannerInputUser();
        this.messagePrinter = new MessagePrinter();
     }

    public void menuOption(String option){
        switch (option){

            case "1":
                messagePrinter.printMessageOnConsole("List of Available Books! : ");

                break;


             case "Q":
                 messagePrinter.printMessageOnConsole("Exit of System");
                 break;

             default:
                 messagePrinter.printMessageOnConsole("Select a valid option!");
                 break;
            }
    }
}
