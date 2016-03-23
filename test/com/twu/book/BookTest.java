package com.twu.book;

import com.twu.types.book.AuthorName;
import com.twu.types.item.Name;
import com.twu.types.item.PublicationYear;
import com.twu.types.book.Book;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;


public class BookTest {
    private Book myBook;

    @Before
    public void setUp() throws Exception {
         this.myBook = new Book(new Name("O Vento"), new PublicationYear(1980), new AuthorName("João Simplicio"));

    }

    @Test
    public void shouldReturnBookName() throws Exception {
        assertThat(myBook.getBookName(), is("O Vento"));
    }

    @Test
    public void shouldReturnAuthorName() throws Exception {
        assertThat(myBook.getAuthorName(), is("João Simplicio"));
    }

    @Test
    public void shouldReturnPublicationYear() throws Exception {
        assertThat(myBook.getPublicationYear(), is(1980));
    }

}