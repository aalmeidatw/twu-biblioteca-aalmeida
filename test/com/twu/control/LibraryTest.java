package com.twu.control;


import com.twu.model.book.Book;
import com.twu.model.book.AuthorName;
import com.twu.model.book.BookName;
import com.twu.model.item.Name;
import com.twu.model.item.PublicationYear;
import com.twu.model.bookLibrary.BookLibrary;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


public class LibraryTest {
    Library library;
    ArrayList<Book> bookList = new ArrayList<>();
    ArrayList<BookLibrary> bookLibraryList = new ArrayList<>();

    @Before
    public void setUp() throws Exception {

        this.library = new Library();

        Book book1 = new Book(new Name("BookName 1"), new PublicationYear(0001), new AuthorName("AuthorName1"));
        Book book2 = new Book(new Name("BookName 2"), new PublicationYear(0002), new AuthorName("AuthorName2"));
        bookList.add(book1);
        bookList.add(book2);

        BookLibrary bookLibrary1 = new BookLibrary(book1, true);
        BookLibrary bookLibrary2 = new BookLibrary(book2, true);
        bookLibraryList.add(bookLibrary1);
        bookLibraryList.add(bookLibrary2);

        library.createBooksList(bookLibraryList);
     }

    @Test (expected = NullPointerException.class)
    public void shouldThrowsNullPointerExceptionWhenIndexPassedIsBiggerThanList(){
        library.checkOutBook(bookLibraryList.size() + 1);
    }

    @Test
    public void shouldSetBookAsUnavailable(){
        library.checkOutBook(1);
        assertThat(bookLibraryList.get(1).isAvailable(), is(false));
    }


    @Test
    public void shouldSetBookAsAvailable(){
        library.checkInBook(1);
        assertThat(bookLibraryList.get(1).isAvailable(), is(true));
    }













}