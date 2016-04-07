package com.twu.menu;


import com.twu.IO.MessagePrinter;
import com.twu.IO.ScannerInputUser;
import com.twu.control.Library;

public class LoginMenu implements Menu {
    private MessagePrinter messagePrinter;
    private Library library;
    private ScannerInputUser scannerInputUser;
    private boolean userAuthenticated;

    public LoginMenu(Library library) {
        this.messagePrinter = new MessagePrinter();
        this.library = library;
        this.scannerInputUser = new ScannerInputUser();
     }

    @Override
    public void execute() {

        String userName = getUserNameInput();
        String password = getPasswordInput();

        setUserStatus(userName, password);
    }

    protected void setUserStatus(String userName, String password) {
        this.userAuthenticated = library.isUserAuthenticated(userName, password);
    }

    protected String getPasswordInput() {

        messagePrinter.messagePrinterOnConsole("PassWord : ");
        String password = scannerInputUser.getInputLoginUser();

        return password;
    }

    protected String getUserNameInput() {

        messagePrinter.messagePrinterOnConsole("UserName : ");
        String userName = scannerInputUser.getInputLoginUser();

        return userName;
    }

    public boolean isUserAuthenticated() {
        return userAuthenticated;
    }
}
