package com.twu.menu;

import com.twu.IO.MessagePrinter;
import com.twu.control.Library;
import com.twu.types.ItemType;


public class MenuOption2 implements Menu {
    private MessagePrinter messagePrinter;
    private Library library;
    private ItemType itemType;

    public MenuOption2(Library library) {
        this.messagePrinter = new MessagePrinter();
        this.library = library;
    }

    @Override
    public void execute() {
        messagePrinter.messagePrinterOnConsole("List of Available Movies!  : ");
        messagePrinter.printerListOfConsole(library.returnItemList(itemType.MOVIE));
    }
}
