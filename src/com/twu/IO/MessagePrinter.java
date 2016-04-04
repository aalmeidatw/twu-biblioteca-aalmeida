package com.twu.IO;


import com.twu.types.library.ItemLibrary;
import java.util.List;


public class MessagePrinter {

    public final void welcomeMessage(){
        System.out.println("Welcome to Bangalore Public Library!");
        System.out.println("===================================");
    }

    public final void messagePrinterOnConsole(String value){
        System.out.println(value);
    }

    public final void showMenuOptions(){
        System.out.println("\n\n ");
        System.out.println("-> 1: List of available books ");
        System.out.println("-> 2: Book Detail  ");
        System.out.println("-> 3: Request book a checkout  ");
        System.out.println("-> 4: Return book a library  ");
        System.out.println("-> Q: Quit System  ");
        System.out.println("-------> Type:  ");
    }


    public final void  printerListOfConsole(List<ItemLibrary> list){

        list.stream()
                .forEach(itemLibrary -> {
                    System.out.print(itemLibrary.getItem().toString());
                });
        }


}
