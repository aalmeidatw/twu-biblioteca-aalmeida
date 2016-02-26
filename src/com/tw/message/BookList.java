package com.tw.message;


import com.tw.book.Book;
import model.AuthorName;
import model.BookName;
import model.PublicationYear;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookList {
    private List<Book> myBookList = new ArrayList<Book>();





    public void createBookList(){
        Book book1 = new Book(new BookName("Dom Quixote"),new AuthorName("Miguel de Cervantes"), new PublicationYear(1605), true);
        Book book2 = new Book(new BookName("Guerra e Paz"),new AuthorName("Liev Tolstói"), new PublicationYear(1869), true);
        Book book3 = new Book(new BookName("A Montanha Mágica"),new AuthorName("Thomas Mann"), new PublicationYear(1924), true);
        Book book4 = new Book(new BookName("Ulisses"),new AuthorName("James Joyce"), new PublicationYear(1922), true);
        Book book5 = new Book(new BookName("Cem Anos de Solidão"),new AuthorName("Gabriel García Márquez"), new PublicationYear(1967), true);

        this.myBookList = Arrays.asList(book1,book2, book3, book4, book5);

    }


    public void showBookList(){

        this.myBookList.forEach(s-> System.out.println(s.getBookName()));









    }
}
