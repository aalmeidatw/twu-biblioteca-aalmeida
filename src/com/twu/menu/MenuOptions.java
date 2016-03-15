package com.twu.menu;


import com.twu.book.Book;
import com.twu.book.BookList;
import com.twu.control.Library;
import com.twu.message.PrinterMessage;
import com.twu.scanner.ScannerInputUser;

import java.util.ArrayList;

public class MenuOptions {
    private Library library;
    private ScannerInputUser scannerInputUser = new ScannerInputUser();
    private PrinterMessage printerMessage = new PrinterMessage();
    ArrayList<Book> availableBooks = new ArrayList<>();
    ArrayList<Book> booksToReturn = new ArrayList<>();

    public MenuOptions(){
        this.library = new Library(new BookList().createBookList());
    }

    public void menuOption(String option){
        switch (option){

            case "1":
                printerMessage.printMessageOnConsole("List of Available Books! : ");
                availableBooks.clear();
                availableBooks = library.getAvailableBooksList();

                showBooksInfo(availableBooks);
                break;

            case "2":
                 printerMessage.printMessageOnConsole("Select a available book: ");
                 Book myBook = library.getBookForDetail(scannerInputUser.getInputIndex());
                 System.out.println(myBook.toString());
                 break;

            case "3":
                showBooksInfo(availableBooks);
                printerMessage.printMessageOnConsole("Select a book: ");
                int value =  scannerInputUser.getInputIndex();
                library.checkOutBook(availableBooks.get(value).getBookName());

                break;

             case "4":
                 printerMessage.printMessageOnConsole("List of Books To Return : ");

                 booksToReturn.clear();
                 booksToReturn = library.getListOfBooksToReturn();

                 showBooksInfo(booksToReturn);

                 System.out.println("Select book to Return:");
                 value = scannerInputUser.getInputIndex();
                 library.setBookAsAvailable(booksToReturn.get(value).getBookName());
                 System.out.print("Tks!");
                 break;

             case "Q":
                 printerMessage.printMessageOnConsole("Exit of System");
                 break;

             default:
                 printerMessage.printMessageOnConsole("Select a valid option!");
                 break;
            }


    }

    private void showBooksInfo(ArrayList bookList){
        bookList.stream().forEach(book -> System.out.println(bookList.indexOf(book) + " - " + book.toString()));
    }


}
