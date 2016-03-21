package com.twu.IO;

import com.twu.provider.BookList;
import com.twu.control.Library;
import com.twu.model.bookLibrary.BookLibrary;
import com.twu.model.bookLibrary.BookLibraryList;
import java.util.ArrayList;

public class MenuOptions {
    private Library library;
    private ScannerInputUser scannerInputUser;
    private PrinterMessage printerMessage;
    //private ArrayList<BookLibrary> availableBooksList =  new ArrayList<>();

    public MenuOptions(){
        this.library = new Library();
        library.createBooksList(new BookLibraryList().createAvailableBookList(new BookList().createBookList()));
        this.scannerInputUser = new ScannerInputUser();
        this.printerMessage = new PrinterMessage();
     }

    public void menuOption(String option){
        switch (option){

            case "1":
                printerMessage.printMessageOnConsole("List of Available Books! : ");
                library.showLibraryBooks(true);


                break;

            case "2":
                 printerMessage.printMessageOnConsole("Select a available book: ");
                 int optionValue = scannerInputUser.getInputIndex();
                 printerMessage.printMessageOnConsole(library.bookDetail(optionValue));
                 break;

            case "3":
                library.showLibraryBooks(true);
                printerMessage.printMessageOnConsole("Select a book: ");
                int value =  scannerInputUser.getInputIndex();
                library.checkOutBook(value);

                break;

             case "4":
                 library.showLibraryBooks(false);
                 printerMessage.printMessageOnConsole("Select a book: ");
                 value = scannerInputUser.getInputIndex();

                 library.checkInBook(value);
                 printerMessage.printMessageOnConsole("Tks");

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
