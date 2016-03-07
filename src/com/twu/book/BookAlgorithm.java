package com.twu.book;

import com.twu.message.PrinterMessage;
import com.twu.scanner.ScannerInputUser;

import java.util.ArrayList;

public class BookAlgorithm {
    private ArrayList<Book> myBooks;
    private PrinterMessage printerMessage = new PrinterMessage();
    private ScannerInputUser scannerInputUser = new ScannerInputUser();




    public void showBookList(ArrayList<Book> myBooks){
        
        this.myBooks = myBooks;
        printerMessage.printMessageOnConsole("List of Available Books! : ");


        this.myBooks.forEach(book ->{
            if(isAvailable(myBooks.indexOf(book))){
                printerMessage.printMessageOnConsole(" -> " + myBooks.indexOf(book)  + " : " +   book.getBookName());
            }
        });
    }

    private boolean isAvailable(int key){
        return this.myBooks.get(key).isAvailable() == true;
    }

    public void bookDetail(ArrayList<Book> myBooks){

        showBookList(myBooks);
        printerMessage.printMessageOnConsole("Select book: ");

        int value = scannerInputUser.getInputIndex();
        showBookDetailInfo(value, myBooks);
    }

    private void showBookDetailInfo(int key, ArrayList<Book> myBooks){

        printerMessage.printMessageOnConsole("Book info: ");
        sendBookNameToPrintInConsole(key, myBooks);
        sendAuthorNameToPrintInConsole(key, myBooks);
        sendPublicationYearToPrintInConsole(key, myBooks);
    }

    private void sendAuthorNameToPrintInConsole(int key, ArrayList<Book> myBooks){
        printerMessage.printMessageOnConsole("Author Name: " + myBooks.get(key).getAuthorName());
    }

    private void sendBookNameToPrintInConsole(int key, ArrayList<Book> myBooks){
        printerMessage.printMessageOnConsole("Book Name: " + myBooks.get(key).getBookName());
    }

    private void sendPublicationYearToPrintInConsole(int key, ArrayList<Book> myBooks){
        printerMessage.printMessageOnConsole("Publication Year: " + myBooks.get(key).getPublicationYear());
    }

    public void checkoutBook(ArrayList<Book> myBooks){

        showBookList(myBooks);
        int indexBook = scannerInputUser.getInputIndex();

        if (indexBook <= myBooks.size() - 1) {
            showBookDetailInfo(indexBook, myBooks);
            getCheckoutBook(indexBook, myBooks);
        }else
            printerMessage.printMessageOnConsole("Book is not found.");
    }

    public void getCheckoutBook(int key, ArrayList<Book> myBooks){

        if (isAvailable(key, myBooks)) {
            setNotAvailableBook(key, myBooks);
            printerMessage.successfulCheckoutMessage();
        }else {
            printerMessage.unsuccessfulCheckoutMessage();
        }
    }

    private boolean isAvailable(int key, ArrayList<Book> myBooks){
        return myBooks.get(key).isAvailable() == true;
    }

    private void setNotAvailableBook(int key, ArrayList<Book> myBooks){
        myBooks.get(key).setAvailableBook(false);

    }

    private void setAvaliableBook(int key, ArrayList<Book> myBooks){
        myBooks.get(key).setAvailableBook(true);
    }

    public void bookReturn(ArrayList<Book> myBooks){
        showBooksToReturn(myBooks);
        printerMessage.printMessageOnConsole("Select book a Return : ");
        int value = scannerInputUser.getInputIndex();

        if(!isAvailable(value)){
            setAvaliableBook(value, myBooks);
            printerMessage.printMessageOnConsole("Thank you for returning the book.");

        }else {
            printerMessage.printMessageOnConsole("That is not a valid book to return.");
        }
    }

    private void showBooksToReturn(ArrayList<Book> myBooks) {
        printerMessage.printMessageOnConsole("List of Books to Return : ");

        myBooks.forEach(book -> {
            if (!isAvailable(myBooks.indexOf(book))) {
                printerMessage.printMessageOnConsole(" -> " + myBooks.indexOf(book) + " : " + book.getBookName());
            }
        });
    }


}
