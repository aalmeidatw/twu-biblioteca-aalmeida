package com.twu.menu;


import com.twu.IO.MessagePrinter;
import com.twu.control.Library;

public class ItemsToReturnMenu implements Menu {
    private MessagePrinter messagePrinter;
    private Library library;


    public ItemsToReturnMenu(Library library){
        this.messagePrinter = new MessagePrinter();
        this.library = library;
    }

    @Override
    public void execute() {
        messagePrinter.print("List of All items To Return: ");
        messagePrinter.printerItemList(library.getAllItemsToReturn());
    }
}
