package com.twu.menu;


import com.twu.IO.MessagePrinter;
import com.twu.control.Library;
import com.twu.types.itemType.ItemType;


public class BookListMenu implements Menu {
    private MessagePrinter messagePrinter;
    private Library library;
    private ItemType itemType;

    public BookListMenu(Library library, MessagePrinter messagePrinter) {
        this.messagePrinter = messagePrinter;
        this.library = library;
    }

    @Override
    public void execute() {
        messagePrinter.print("List of Available Books!  : ");
        messagePrinter.printerItemList(library.returnItemList(itemType.BOOK));
    }
}
