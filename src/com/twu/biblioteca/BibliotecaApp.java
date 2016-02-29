package com.twu.biblioteca;


import com.twu.book.BookList;
import com.twu.message.MessageToConsole;

public class BibliotecaApp {

    public static void main(String[] args) {

        MessageToConsole messageToConsole = new MessageToConsole();
        BookList bookList = new BookList();


        messageToConsole.welcomeMessage();
        bookList.createBookList();
        bookList.showBookList();
        System.out.println("========================");
        System.out.println("Livro selecionado");
        bookList.selectedBook(1);
        System.out.println("========================");
        System.out.println("Fazendo checkout");
        bookList.getCheckoutBook(0);
        System.out.println("========================");
        System.out.println("Nova lista de livros");
        bookList.showBookList();

    }
}
