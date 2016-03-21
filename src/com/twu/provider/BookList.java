package com.twu.provider;

import com.twu.model.book.Book;
import com.twu.model.book.AuthorName;
import com.twu.model.book.BookName;
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






//        Book book1 = new Book(new Name("In Search of Lost Time"),new AuthorName("Marcel Proust"), new PublicationYear(1913));
//        Book book2 = new Book(new BookName("Ulysses"),new AuthorName("James Joyce"), new PublicationYear(1904));
//        Book book3 = new Book(new BookName("Moby Dick"),new AuthorName("Herman Melville"), new PublicationYear(1851));
//        Book book4 = new Book(new BookName("Hamlet"),new AuthorName("William Shakespeare Joyce"), new PublicationYear(1599));
//        Book book5 = new Book(new BookName("War And Peace"),new AuthorName("Leo TolStoy"), new PublicationYear(1873));

         this.myBookList.add(book1);
         this.myBookList.add(book2);
         this.myBookList.add(book3);
         this.myBookList.add(book4);
         this.myBookList.add(book5);

         return this.myBookList;
    }
}
