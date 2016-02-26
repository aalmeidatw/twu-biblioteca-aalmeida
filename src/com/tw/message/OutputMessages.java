package com.tw.message;


import com.tw.book.Book;



public class OutputMessages {

    public void welcomeMessage(){
        System.out.println("Welcome to Bangalore Public Library!");
        System.out.println("===================================");


    }

    public static void showBookLists(){

//        new ArrayList().stream().toString();
//        new ArrayList().stream();
    }


    public void showBookData(Book myBook){
        System.out.println("Name: " + myBook.getBookName());
        System.out.println("Author: " + myBook.getAuthorName());
        System.out.println("Year Published:  " + myBook.getPublicationYear());

    }





}
