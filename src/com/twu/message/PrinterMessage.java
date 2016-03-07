package com.twu.message;


public class PrinterMessage {

    public final void welcomeMessage(){
        System.out.println("Welcome to Bangalore Public Library!");
        System.out.println("===================================");
    }

    public final void printMessageOnConsole(String value){
        System.out.println(value);
    }

    public final void successfulCheckoutMessage(){
        System.out.println("Thank you! Enjoy the book");
    }

    public final void unsuccessfulCheckoutMessage(){
        System.out.println("That book is not available");
    }

    public void selectedOptionMessage(){
        System.out.println("\n\n ");
        System.out.println("Select Option: ");
    }

    public void showOtherFunctionsMessage(){
        System.out.println("-> L: List of available books ");
        System.out.println("-> B: Book Detail  ");
        System.out.println("-> R: Request book a checkout  ");
        System.out.println("-> C: Return book a library  ");
        System.out.println("-> Q: Quit System  ");
    }

}
