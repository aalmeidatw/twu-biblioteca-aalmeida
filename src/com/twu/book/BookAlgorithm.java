package com.twu.book;

import com.twu.IO.PrinterMessage;
import com.twu.IO.ScannerInputUser;
import com.twu.bookModel.Book;
import java.util.ArrayList;

public class BookAlgorithm {
    private ArrayList<Book> myBooks;
    private PrinterMessage printerMessage = new PrinterMessage();
    private ScannerInputUser scannerInputUser = new ScannerInputUser();

    public BookAlgorithm(ArrayList<Book> myBooks){
        this.myBooks = myBooks;
    }

    public void showListAvailableBooks(){
        searchListOfAvailableBooks();
    }

    public void searchListOfAvailableBooks(){
        this.myBooks.forEach(book ->{
            if(bookIsAvailable(myBooks.indexOf(book))){
                printerMessage.print(" -> " + myBooks.indexOf(book)  + " : " +   book.getBookName());
            }
        });
    }

    public void bookDetail(){

        showListAvailableBooks();

        printerMessage.print("Select book: ");

        int value = scannerInputUser.getInputIndex();
        showBookDetailInfo(value);
    }

    private void showBookDetailInfo(int key){

        printerMessage.print("Book info: ");
        sendBookNameToPrintInConsole(key);
        sendAuthorNameToPrintInConsole(key);
        sendPublicationYearToPrintInConsole(key);
    }

    private void sendAuthorNameToPrintInConsole(int key){
        printerMessage.print("Author Name: " + myBooks.get(key).getAuthorName());
    }

    private void sendBookNameToPrintInConsole(int key){
        printerMessage.print("Book Name: " + myBooks.get(key).getBookName());
    }

    private void sendPublicationYearToPrintInConsole(int key){
        printerMessage.print("Publication Year: " + myBooks.get(key).getPublicationYear());
    }

    public void checkoutBook(){

        showListAvailableBooks();
        int indexBook = scannerInputUser.getInputIndex();

        if (indexBook <= myBooks.size() - 1) {
            showBookDetailInfo(indexBook);
            getCheckoutBook(indexBook);
        }else
            printerMessage.print("Book is not found.");
    }

    public void getCheckoutBook(int key){

        if (bookIsAvailable(key)) {
            setNotAvailableBook(key);
            printerMessage.successfulCheckoutMessage();
        }else {
            printerMessage.unsuccessfulCheckoutMessage();
        }
    }

    private boolean bookIsAvailable(int key){
        return myBooks.get(key).isAvailable() == true;
    }

    private void setNotAvailableBook(int key){
        myBooks.get(key).setAvailableBook(false);

    }

    private void setAvaliableBook(int key){
        myBooks.get(key).setAvailableBook(true);
    }

    public void bookReturn(){
        showBooksToReturn();
        printerMessage.print("Select book a Return : ");
        int value = scannerInputUser.getInputIndex();

        if(!bookIsAvailable(value)){
            setAvaliableBook(value);
            printerMessage.print("Thank you for returning the book.");

        }else {
            printerMessage.print("That is not a valid book to return.");
        }
    }

    private void showBooksToReturn() {
        printerMessage.print("List of Books to Return : ");

        searchBooksToReturn();
    }

    private void searchBooksToReturn(){
        this.myBooks.forEach(book -> {
            if (!bookIsAvailable(this.myBooks.indexOf(book))) {
                printerMessage.print(" -> " + myBooks.indexOf(book) + " : " + book.getBookName());
            }
        });

    }
}
