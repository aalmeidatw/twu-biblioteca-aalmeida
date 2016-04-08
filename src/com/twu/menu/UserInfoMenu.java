package com.twu.menu;


import com.twu.IO.MessagePrinter;
import com.twu.control.Library;

public class UserInfoMenu implements Menu {
    private Library library;
    private MessagePrinter messagePrinter;

    public UserInfoMenu(Library library){
        this.library = library;
        this.messagePrinter = new MessagePrinter();
    }

    @Override
    public void execute() {
        messagePrinter.messagePrinterOnConsole("User Info: ");
        messagePrinter.messagePrinterOnConsole(library.getUserInfo());
    }
}
