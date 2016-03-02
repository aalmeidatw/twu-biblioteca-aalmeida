package com.twu.getInput;



import com.twu.message.MessageToConsole;
import java.util.Scanner;

public class GetScannerInput {
    private MessageToConsole messageToConsole;
    Scanner scanner = new Scanner(System.in);

    public String getUserInfoScanner(){

        messageToConsole.printMessageOnConsole("\n\n ");
        messageToConsole.printMessageOnConsole("Choise a letter :");

        return scanner.nextLine().toUpperCase();
    }

    public int getInputIndex(){
        return scanner.nextInt();

    }
}






