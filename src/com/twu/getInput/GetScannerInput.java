package com.twu.getInput;



import com.twu.message.MessageToConsole;

import java.util.Scanner;

public class GetScannerInput {
    private MessageToConsole messageToConsole;


    public String getInputUser(String message){

        this.messageToConsole = new MessageToConsole();
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();

        return value;
    }


    public boolean isOutSystem(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a letra");
        String value = scanner.nextLine();

        return (value.toUpperCase().equals("Q"));

        }

    }






