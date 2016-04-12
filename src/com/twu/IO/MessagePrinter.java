package com.twu.IO;


import com.twu.types.library.ItemLibrary;
import java.util.List;


public class MessagePrinter {

    public final void welcomeMessage() {
        System.out.println("Welcome to Bangalore Public Library!");
        System.out.println("===================================");
    }

    public final void messagePrinterOnConsole(String value) {
        System.out.println(value);
    }

    public final void showMenuOptions() {
        System.out.println("\n\n ");
        System.out.println("-> 1: List of available Books ");
        System.out.println("-> 2: List of available Movies ");
        System.out.println("-> 3: Lend Item ");
        System.out.println("-> 4: Show All items to Return  ");
        System.out.println("-> 5: Show My User Info: ");
        System.out.println("-> Q: Quit System  ");
        System.out.println("-------> Type:  ");
    }

    public final void printerItemListOnConsole(List<ItemLibrary> list) {

        list.stream()
                .forEach(itemLibrary -> {
                    System.out.print(itemLibrary.getItem().toString());
                });
    }
}
