package com.tw.book;

import model.AuthorName;
import model.PublicationYear;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;


public class BookTest {
    private Book myBook;
    private AuthorName authorName;
    private PublicationYear publicationYear;
    private boolean isAvailable;


    @Before
    public void setUp() throws Exception {
        this.authorName = new AuthorName("João Simplicio");
        this.publicationYear = new PublicationYear(1980);
        this.isAvailable = true;
        this.myBook = new Book(authorName, publicationYear, isAvailable);
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
    public void shouldReturnTrueWhenBookIsAvaliable() throws Exception {
        assertThat(myBook.isAvaliable(), is(true));
    }
}