package com.twu.book;

import com.twu.model.bookData.AuthorName;
import com.twu.model.bookData.BookName;
import com.twu.model.bookData.PublicationYear;
import com.twu.model.book.Book;
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
    public void shouldReturnAuthorName() throws Exception {
        assertThat(myBook.getAuthorName(), is("João Simplicio"));
    }

    @Test
    public void shouldReturnPublicationYear() throws Exception {
        assertThat(myBook.getPublicationYear(), is(1980));
    }

    @Test
    public void shouldReturnTrueWhenBookIsAvailable() throws Exception {
        assertThat(myBook.isAvailable(), is(true));
    }

    @Test
    public void shouldReturnFalseWhenBookIsNotAvailable() throws Exception {
        this.myBook = new Book(new BookName("O Vento"), new AuthorName("João Simplicio"), new PublicationYear(1980), false);
        assertThat(myBook.isAvailable(), is(false));
    }

//    @Test
//    public void shouldReturnAvaliableBooleanProperty(){
//        this.myBook.setAvailableBook(true);
//        assertThat(this.myBook.isAvailable(), is(true));
//    }
//
//    @Test
//    public void shouldReturnNotAvaliableBooleanProperty(){
//        this.myBook.setAvailableBook(false);
//        assertThat(this.myBook.isAvailable(), is(false));
//    }


}