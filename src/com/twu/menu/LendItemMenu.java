package com.twu.menu;


import com.twu.IO.MessagePrinter;
import com.twu.IO.ScannerInputUser;
import com.twu.control.Library;

public class LendItemMenu implements Menu {
    private MessagePrinter messagePrinter;
    private Library library;
    private ScannerInputUser scannerInputUser;

    public LendItemMenu(Library library){
        this.messagePrinter = new MessagePrinter();
        this.scannerInputUser = new ScannerInputUser();
        this.library = library;
    }

    @Override
    public void execute() {
        messagePrinter.messagePrinterOnConsole("Type ItemName To Lend :");
        String itemName = scannerInputUser.getNameItemScanner();

        try {
            library.lendItem(itemName);
        }
        catch (Exception e){
            messagePrinter.messagePrinterOnConsole(e.getMessage());
        }
    }
}
