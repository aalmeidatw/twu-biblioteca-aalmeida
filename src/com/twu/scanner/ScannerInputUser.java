package com.twu.scanner;

import com.twu.message.PrinterMessage;
import java.util.Scanner;

public class ScannerInputUser {
    private PrinterMessage printerMessage = new PrinterMessage();
    Scanner scanner = new Scanner(System.in);

    public String getUserInfoScanner(){

        printerMessage.printMessageOnConsole("\n\n ");
        printerMessage.printMessageOnConsole("Choise a letter :");

        return scanner.nextLine().toUpperCase();
    }

    public int getInputIndex(){
        return scanner.nextInt();

    }
}






