package com.twu.libraryApp;
import com.twu.book.Book;
import com.twu.book.BookList;
import com.twu.control.Library;
import com.twu.message.PrinterMessage;
import com.twu.scanner.ScannerInputUser;

import java.util.ArrayList;


public class LibraryApp {

    public static void main(String[] args) {
        ArrayList<Book> availableBooks = new ArrayList<>();
        ArrayList<Book> booksToReturn = new ArrayList<>();
        PrinterMessage printerMessage = new PrinterMessage();
        ScannerInputUser scannerInputUser = new ScannerInputUser();
        ArrayList<Book> myBooks = new BookList().createBookList();
        Library library = new Library(myBooks);


        printerMessage.welcomeMessage();
        boolean quitSystem = false;


     do {

         printerMessage.showOtherFunctionsMessage();
         String option = scannerInputUser.getUserInfoScanner();


         switch (option) {
             case "L":
                 printerMessage.printMessageOnConsole("List of Available Books! : ");
                 availableBooks = library.getAvailableBooksList();

                 availableBooks.forEach(book -> System.out.println( " " + book.getBookName()));
                 break;

             case "B":
                 Book myBook = library.getBookForDetail(scannerInputUser.getInputIndex());
                 System.out.println(myBook.getBookName() + " - " + myBook.getAuthorName() + " - " + myBook.getPublicationYear());
                 break;

             case "R":
                //bookAlgorithm.checkoutBook();
                 break;

             case "C":
                 printerMessage.printMessageOnConsole("List of Books To Return : ");
                 booksToReturn = library.getListOfBooksToReturn();

                 booksToReturn.forEach(book -> System.out.println( " " + book.getBookName()));
                 System.out.println("Select book to Return:");
                 int value = scannerInputUser.getInputIndex();
                 library.returnBook(booksToReturn.get(value).getBookName());
                 System.out.print("Tks!");
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
