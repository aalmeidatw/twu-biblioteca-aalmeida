package com.twu.book;

import com.twu.model.AuthorName;
import com.twu.model.BookName;
import com.twu.model.PublicationYear;
import java.util.ArrayList;


public class BookList {
    private ArrayList<Book> myBookList = new ArrayList<>();

     public ArrayList<Book> createBookList(){
        Book book1 = new Book(new BookName("In Search of Lost Time"),new AuthorName("Marcel Proust"), new PublicationYear(1913), false);
        Book book2 = new Book(new BookName("Ulysses"),new AuthorName("James Joyce"), new PublicationYear(1904), false);
        Book book3 = new Book(new BookName("Moby Dick"),new AuthorName("Herman Melville"), new PublicationYear(1851), false);
        Book book4 = new Book(new BookName("Hamlet"),new AuthorName("William Shakespeare Joyce"), new PublicationYear(1599), false);
        Book book5 = new Book(new BookName("War And Peace"),new AuthorName("Leo TolStoy"), new PublicationYear(1873), true);

         this.myBookList.add(book1);
         this.myBookList.add(book2);
         this.myBookList.add(book3);
         this.myBookList.add(book4);
         this.myBookList.add(book5);

         return  this.myBookList;
    }
}
