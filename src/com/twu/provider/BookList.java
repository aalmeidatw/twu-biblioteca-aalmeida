package com.twu.provider;

import com.twu.model.book.Book;
import com.twu.model.book.AuthorName;
import com.twu.model.item.Item;
import com.twu.model.item.Name;
import com.twu.model.item.PublicationYear;
import java.util.ArrayList;


public class BookList {
    private ArrayList<Book> myBookList = new ArrayList<>();

     public ArrayList<Book> createBookList(){

         Book book1 = new Book(new Name("In Search of Lost Time"), new PublicationYear(1913), new AuthorName("Marcel Proust"));
         Book book2 = new Book(new Name("Ulysses"), new PublicationYear(1904), new AuthorName("James Joyce"));
         Book book3 = new Book(new Name("Moby Dick"), new PublicationYear(1851), new AuthorName("Herman Melville"));
         Book book4 = new Book(new Name("Hamlet"), new PublicationYear(1599), new AuthorName("\"William Shakespeare"));
         Book book5 = new Book(new Name("War And Peace"), new PublicationYear(1873), new AuthorName("Leo TolStoy"));




         this.myBookList.add(book1);
         this.myBookList.add(book2);
         this.myBookList.add(book3);
         this.myBookList.add(book4);
         this.myBookList.add(book5);

         return this.myBookList;
    }
}
