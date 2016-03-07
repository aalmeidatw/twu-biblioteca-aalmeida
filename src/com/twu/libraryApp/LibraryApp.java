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
        BookAlgorithm bookAlgorithm = new BookAlgorithm();
        ArrayList<Book> myBooks = new BookList().createBookList();

        printerMessage.welcomeMessage();
        boolean quitSystem = false;


     do {
         printerMessage.selectedOptionMessage();
         printerMessage.showOtherFunctionsMessage();

         String option = scannerInputUser.getUserInfoScanner();

         switch (option) {
             case "L":
                 bookAlgorithm.showBookList(myBooks);
                 break;

             case "B":
                 bookAlgorithm.bookDetail(myBooks);
                 break;

             case "R":
                 bookAlgorithm.checkoutBook(myBooks);
                 break;

             case "C":
                 bookAlgorithm.bookReturn(myBooks);
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
