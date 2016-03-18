package com.twu.IO;

import com.twu.model.book.BookList;
import com.twu.control.Library;
import com.twu.model.bookLibrary.BookLibrary;
import com.twu.model.bookLibrary.BookLibraryList;
import java.util.ArrayList;

public class MenuOptions {
    private Library library;
    private ScannerInputUser scannerInputUser;
    private PrinterMessage printerMessage;
    private ArrayList<BookLibrary> availableBooksList =  new ArrayList<>();

    public MenuOptions(){
        this.availableBooksList = new BookLibraryList().createAvailableBookList(new BookList().createBookList());
        this.library = new Library();
        this.scannerInputUser = new ScannerInputUser();
        this.printerMessage = new PrinterMessage();
     }

    public void menuOption(String option){
        switch (option){

            case "1":
                printerMessage.printMessageOnConsole("List of Available Books! : ");
                showLibraryBooks(true);

                break;

            case "2":
                 printerMessage.printMessageOnConsole("Select a available book: ");
                 int optionValue = scannerInputUser.getInputIndex();
                 System.out.println(this.availableBooksList.get(optionValue).getBook().toString());
                 break;

            case "3":
                showLibraryBooks(true);
                printerMessage.printMessageOnConsole("Select a book: ");
                int value =  scannerInputUser.getInputIndex();
                library.checkOutBook(availableBooksList, value);

                break;

             case "4":
                 showLibraryBooks(false);
                 printerMessage.printMessageOnConsole("Select a book: ");
                 value = scannerInputUser.getInputIndex();

                 library.checkInBook(availableBooksList, value);
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


    private void showLibraryBooks(boolean isAvailable){

        this.availableBooksList.forEach(book ->{
            if(((book.isAvailable()) == (isAvailable))){
                System.out.println(availableBooksList.indexOf(book) + " - " + book.toString());
            }


        });
    }


}
