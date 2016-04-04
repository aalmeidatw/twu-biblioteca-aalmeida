package com.twu.menu;


import com.twu.IO.MessagePrinter;
import com.twu.control.Library;


public class MenuOption1 implements Menu {
    private MessagePrinter messagePrinter;
    private Library library;

    public MenuOption1(Library library) {
        this.messagePrinter = new MessagePrinter();
        this.library = library;
    }

    @Override
    public void execute() {
        messagePrinter.meessagePrinterOnConsole("List of Available Books!  : ");
        messagePrinter.printerListOfConsole(library.returnBookList());
    }




}
