package com.twu.libraryApp;
import com.twu.bookModel.Book;
import com.twu.book.BookAlgorithm;
import com.twu.provider.BookList;
import com.twu.IO.PrinterMessage;
import com.twu.IO.ScannerInputUser;

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

        }
     }  while (!quitSystem);

    }
}
