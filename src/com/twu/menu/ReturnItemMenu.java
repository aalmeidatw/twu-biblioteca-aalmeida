package com.twu.menu;


import com.twu.IO.MessagePrinter;
import com.twu.IO.ScannerInputUser;
import com.twu.control.Library;

public class ReturnItemMenu implements Menu {
    private MessagePrinter messagePrinter;
    private Library library;
    private ScannerInputUser scannerInputUser;

    public ReturnItemMenu(Library library) {
        this.messagePrinter = new MessagePrinter();
        this.scannerInputUser = new ScannerInputUser();
        this.library = library;
    }

    @Override
    public void execute() {
        messagePrinter.messagePrinterOnConsole("List Items To Return: " + "\n\n");
        messagePrinter.printerItemListOnConsole(library.getAllItemsToReturn());

        messagePrinter.messagePrinterOnConsole("Type ItemName To Return :" + "\n\n");
        String itemName = scannerInputUser.getNameItemScanner();

        try {
            library.returnBorrowedItem(itemName);
        }
        catch (Exception e){
            messagePrinter.messagePrinterOnConsole(e.getMessage());
        }
    }
}
