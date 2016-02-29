package com.twu.message;


public class MessageToConsole {

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



}
