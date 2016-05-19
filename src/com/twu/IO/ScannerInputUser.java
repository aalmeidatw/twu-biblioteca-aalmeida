package com.twu.IO;

import java.util.Scanner;

public class ScannerInputUser {
    private PrinterMessage printerMessage = new PrinterMessage();
    Scanner scanner = new Scanner(System.in);

    public String getUserInfoScanner(){

        printerMessage.print("\n\n ");
        printerMessage.print("Choise a letter :");

        return scanner.nextLine().toUpperCase();
    }

    public int getInputIndex(){
        return scanner.nextInt();

    }
}






