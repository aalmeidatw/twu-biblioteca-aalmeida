package com.twu.libraryApp;
import com.twu.book.Book;
import com.twu.book.BookAlgorithm;
import com.twu.book.BookList;
import com.twu.message.PrinterMessage;
import com.twu.scanner.ScannerInputUser;

import java.util.ArrayList;


public class LibraryApp {

    public static void main(String[] args) {



        PrinterMessage printerMessage = new PrinterMessage();
        ScannerInputUser scannerInputUser = new ScannerInputUser();
        ArrayList<Book> myBooks = new BookList().createBookList();
        BookAlgorithm bookAlgorithm = new BookAlgorithm(myBooks);

        printerMessage.welcomeMessage();
        boolean quitSystem = false;


     do {
         printerMessage.selectedOptionMessage();
         printerMessage.showOtherFunctionsMessage();

         String option = scannerInputUser.getUserInfoScanner();

         switch (option) {
             case "L":
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
                 printerMessage.printMessageOnConsole("Select a valid option!");

        }
     }  while (!quitSystem);

    }
}
