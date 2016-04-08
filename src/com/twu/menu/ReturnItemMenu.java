package com.twu.menu;


import com.twu.IO.MessagePrinter;
import com.twu.IO.ScannerInputUser;
import com.twu.control.Library;
import com.twu.types.itemType.ItemType;

public class ReturnItemMenu implements Menu {
    private MessagePrinter messagePrinter;
    private Library library;
    private ItemType itemType;
    private ScannerInputUser scannerInputUser;

    public ReturnItemMenu(Library library) {
        this.messagePrinter = new MessagePrinter();
        this.library = library;
    }

    @Override
    public void execute() {
        messagePrinter.messagePrinterOnConsole("Type Item Name To Return :");
        String itemName = scannerInputUser.getUserInfoScanner();
        library.returnItem(itemName);
    }
}
