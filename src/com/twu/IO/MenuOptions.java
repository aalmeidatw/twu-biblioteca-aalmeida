package com.twu.IO;

import com.twu.control.Library;
import com.twu.provider.ItemListLibrarySetup;

public class MenuOptions {
    private Library library;
    private ScannerInputUser scannerInputUser;
    private PrinterMessage printerMessage;


    public MenuOptions(){
        this.library = new Library();
        library.getItemsLibrary(new ItemListLibrarySetup().createItemListLibrary());
        this.scannerInputUser = new ScannerInputUser();
        this.printerMessage = new PrinterMessage();
     }

    public void menuOption(String option){
        switch (option){

            case "1":
                printerMessage.printMessageOnConsole("List of Available Books! : ");
                library.showAvailableBooksListInTheLibrary();


                break;




             case "Q":
                 printerMessage.printMessageOnConsole("Exit of System");
                 break;

             default:
                 printerMessage.printMessageOnConsole("Select a valid option!");
                 break;
            }
    }
}
