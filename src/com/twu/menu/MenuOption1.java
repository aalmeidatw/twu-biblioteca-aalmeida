package com.twu.menu;


import com.twu.IO.MessagePrinter;
import com.twu.control.Library;
import com.twu.types.ItemType;


public class MenuOption1 implements Menu {
    private MessagePrinter messagePrinter;
    private Library library;
    private ItemType itemType;

    public MenuOption1(Library library) {
        this.messagePrinter = new MessagePrinter();
        this.library = library;
    }

    @Override
    public void execute() {
        messagePrinter.messagePrinterOnConsole("List of Available Books!  : ");
        messagePrinter.printerListOfConsole(library.returnItemList(itemType.BOOK));
    }




}
