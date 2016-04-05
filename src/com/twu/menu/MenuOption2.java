package com.twu.menu;

import com.twu.IO.MessagePrinter;
import com.twu.control.Library;


public class MenuOption2 implements Menu {
    private MessagePrinter messagePrinter;
    private Library library;

    public MenuOption2(Library library) {
        this.messagePrinter = new MessagePrinter();
        this.library = library;
    }

    @Override
    public void execute() {
        messagePrinter.messagePrinterOnConsole("List of Available Movies!  : ");
        messagePrinter.printerListOfConsole(library.returnMovieList());

    }
}
