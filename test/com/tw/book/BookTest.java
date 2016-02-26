package com.tw.book;

import model.AuthorName;
import model.PublicationYear;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;


public class BookTest {
    private Book myBook;

    @Before
    public void setUp() throws Exception {
         this.myBook = new Book(new AuthorName("João Simplicio"), new PublicationYear(1980), true);
    }

    @Test
    public void shouldReturnAuthorNameAtBook() throws Exception {
        assertThat(myBook.getAuthorName(), is("João Simplicio"));
    }

    @Test
    public void shouldReturnPublicationYearAtBook() throws Exception {
        assertThat(myBook.getPublicationYear(), is(1980));
    }

    @Test
    public void shouldReturnTrueWhenBookIsAvailable() throws Exception {
        assertThat(myBook.isAvaliable(), is(true));
    }

    @Test
    public void shouldReturnFalseWhenBookIsNotAvailable() throws Exception {
        this.myBook = new Book(new AuthorName("João Simplicio"), new PublicationYear(1980), false);
        assertThat(myBook.isAvaliable(), is(false));
    }
}