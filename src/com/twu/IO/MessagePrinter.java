package com.twu.IO;


import com.twu.types.library.ItemLibrary;
import java.util.List;
import java.util.Optional;


public class MessagePrinter {

    public final void welcomeMessage() {
        System.out.println("Welcome to Bangalore Public Library!");
        System.out.println("===================================");
    }

    public final void print(String value) {
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

    public final void printerItemList(List<ItemLibrary> list) {
        list.stream()
                .filter(itemLibrary -> {
                    System.out.print(itemLibrary.getItem().toString());
                    return true;
                });
    }

}
