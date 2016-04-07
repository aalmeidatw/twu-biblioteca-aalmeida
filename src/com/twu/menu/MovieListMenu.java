package com.twu.menu;

import com.twu.IO.MessagePrinter;
import com.twu.control.Library;
import com.twu.types.ItemType;


public class MovieListMenu implements Menu {
    private MessagePrinter messagePrinter;
    private Library library;
    private ItemType itemType;

    public MovieListMenu(Library library) {
        this.messagePrinter = new MessagePrinter();
        this.library = library;
    }

    @Override
    public void execute() {
        messagePrinter.messagePrinterOnConsole("List of Available Movies!  : ");
        messagePrinter.printerListOfConsole(library.returnItemList(itemType.MOVIE));
    }
}
