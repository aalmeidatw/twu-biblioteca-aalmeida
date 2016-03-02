package com.twu.biblioteca;
import com.twu.book.BookList;
import com.twu.getInput.GetScannerInput;
import com.twu.message.MessageToConsole;


public class BibliotecaApp {

    public static void main(String[] args) {

        MessageToConsole messageToConsole = new MessageToConsole();
        BookList bookList = new BookList();
        GetScannerInput getScannerInput = new GetScannerInput();
         bookList.createBookList();


        messageToConsole.welcomeMessage();
        boolean quitSystem = false;


     do {
         messageToConsole.selectedOptionMessage();
         messageToConsole.showOtherFunctionsMessage();
         String option = getScannerInput.getScanner();

         switch (option) {
             case "L":
                 bookList.showBookList();
                 break;

             case "R":
                 bookList.checkoutBook();
                 break;

             case "C":
                 bookList.bookReturn();
                 break;
             case "Q":
                 quitSystem = true;
        }
     }  while (!quitSystem);

    }
}
