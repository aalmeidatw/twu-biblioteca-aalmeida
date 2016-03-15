package com.twu.control;

import com.twu.book.Book;
import com.twu.model.AuthorName;
import com.twu.model.BookName;
import com.twu.model.PublicationYear;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;


public class LibraryTest {
    Library library;
    ArrayList<Book> bookArrayList = new ArrayList<>();


    private class BookMock extends Book{

        public BookMock(BookName bookName, AuthorName authorName, PublicationYear publicationYear, boolean isReserved) {
            super(bookName, authorName, publicationYear, isReserved);
        }

    }


    @Before
    public void setUp() throws Exception {
        bookArrayList.add(new BookMock(new BookName("Bookname1"), new AuthorName("AuthorName1"), new PublicationYear(1931), true));
        bookArrayList.add(new BookMock(new BookName("Bookname2"), new AuthorName("AuthorName1"), new PublicationYear(1932), true));
        bookArrayList.add(new BookMock(new BookName("Bookname3"), new AuthorName("AuthorName2"), new PublicationYear(1933), true));

        this.library = new Library(bookArrayList);
    }

    @Test
    public void  shouldReturnWhenBookAsFound(){

    }



}