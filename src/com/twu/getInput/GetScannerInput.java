package com.twu.getInput;



import com.twu.message.MessageToConsole;

import java.util.Scanner;

public class GetScannerInput {
    private MessageToConsole messageToConsole;
    Scanner scanner = new Scanner(System.in);


    public String getInputUser(String message){

        this.messageToConsole = new MessageToConsole();

        String value = scanner.nextLine();

        return value;
    }


    public boolean isOutSystem(){

        System.out.println("Choise : ");
        String value = scanner.nextLine();

        return (value.toUpperCase().equals("Q"));

        }

    public String getScanner(){

        System.out.println("\n\n ");
        System.out.println("Choise a letter :");

        return scanner.nextLine().toUpperCase();

    }

    public int getInputIndex(){
        System.out.println("Choise : ");

        return scanner.nextInt();
    }

    }






