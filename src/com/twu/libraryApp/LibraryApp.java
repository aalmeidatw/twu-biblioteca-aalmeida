package com.twu.libraryApp;
<<<<<<< HEAD
import com.twu.bookModel.Book;
import com.twu.book.BookAlgorithm;
import com.twu.provider.BookList;
import com.twu.IO.PrinterMessage;
import com.twu.IO.ScannerInputUser;

import java.util.ArrayList;

=======
import com.twu.control.Library;
import com.twu.control.ManagementUser;
import com.twu.menu.menu.MenuOptions;
import com.twu.IO.MessagePrinter;
import com.twu.IO.ScannerInputUser;
import com.twu.provider.LibraryItems;
>>>>>>> 82928648e1b8131c3a3f9c02a4e3935261eba03a

public class LibraryApp {

    public static void main(String[] args) {

<<<<<<< HEAD
        PrinterMessage printerMessage = new PrinterMessage();
        ScannerInputUser scannerInputUser = new ScannerInputUser();
        ArrayList<Book> myBooks = new BookList().createBookList();
        BookAlgorithm bookAlgorithm = new BookAlgorithm(myBooks);

        printerMessage.welcomeMessage();
        boolean quitSystem = false;

     do {
         printerMessage.selectedOptionMessage();
         printerMessage.showOtherFunctionsMessage();
=======
        MessagePrinter messagePrinter = new MessagePrinter();
        ScannerInputUser scannerInputUser = new ScannerInputUser();
        Library library = new Library(new LibraryItems().createItemListLibrary(), new ManagementUser());
        MenuOptions menu = new MenuOptions(library, scannerInputUser, messagePrinter);

        String option;
        messagePrinter.welcomeMessage();
>>>>>>> 82928648e1b8131c3a3f9c02a4e3935261eba03a

        if (menu.userLogin()) {

<<<<<<< HEAD
         switch (option) {
             case "L":
                 printerMessage.print("List of Available Books! : ");
                 bookAlgorithm.showListAvailableBooks();
                 break;

             case "B":
                 bookAlgorithm.bookDetail();
                 break;

             case "R":
                 bookAlgorithm.checkoutBook();
                 break;

             case "C":
                 bookAlgorithm.bookReturn();
                 break;

             case "Q":
                 quitSystem = true;
                 break;

             default:
                 printerMessage.print("Select a valid option!");
=======
            do {
                messagePrinter.showMenuOptions();
                option = scannerInputUser.getUserInfoScanner();
                menu.menuOption(option);

            } while (!option.equals("Q"));
        } else {
            messagePrinter.print("LOGIN FAIL - SYSTEM IS OUT!");
>>>>>>> 82928648e1b8131c3a3f9c02a4e3935261eba03a

        }
    }

}
