package com.twu.menu;


import com.twu.IO.MessagePrinter;
import com.twu.IO.ScannerInputUser;
import com.twu.control.Library;

public class LoginMenu implements Menu {
    private MessagePrinter messagePrinter;
    private Library library;
    private ScannerInputUser scannerInputUser;
    private boolean userAuthenticated;
    private static boolean AUTHENTICATED = true;
    private static boolean NOT_AUTHENTICATED = false;

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

        if (library.loginUser(userName, password)){
            this.userAuthenticated = AUTHENTICATED;
            library.setUserAuthenticated(library.getUser(userName));
        } else
            this.userAuthenticated = NOT_AUTHENTICATED;
    }

    protected String getPasswordInput() {
        messagePrinter.messagePrinterOnConsole("PassWord : ");
        return scannerInputUser.getInputLoginUser();
    }

    protected String getUserNameInput() {
        messagePrinter.messagePrinterOnConsole("UserName : ");
        return  scannerInputUser.getInputLoginUser();
    }

    public boolean isUserAuthenticated() {
        return userAuthenticated;
    }
}
