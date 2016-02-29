package com.twu.book;

import com.twu.model.AuthorName;
import com.twu.model.BookName;
import com.twu.model.PublicationYear;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;


public class BookTest {
    private Book myBook;

    @Before
    public void setUp() throws Exception {
         this.myBook = new Book(new BookName("O Vento"),new AuthorName("João Simplicio"), new PublicationYear(1980), true);
    }

    @Test
    public void shouldReturnBookName() throws Exception {
        assertThat(myBook.getBookName(), is("O Vento"));
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
        this.myBook = new Book(new BookName("O Vento"), new AuthorName("João Simplicio"), new PublicationYear(1980), false);
        assertThat(myBook.isAvaliable(), is(false));
    }
}