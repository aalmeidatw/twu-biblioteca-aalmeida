package com.twu.menu;


import com.twu.IO.MessagePrinter;
import com.twu.control.Library;

public class ShowAllItemMenu implements Menu {
    private MessagePrinter messagePrinter;
    private Library library;


    public ShowAllItemMenu (Library library){
        this.messagePrinter = new MessagePrinter();
        this.library = library;
    }

    @Override
    public void execute() {
        messagePrinter.messagePrinterOnConsole("List of All items To Return: ");
        messagePrinter.printerListOfConsole(library.getAllItemsToReturn());
    }
}
