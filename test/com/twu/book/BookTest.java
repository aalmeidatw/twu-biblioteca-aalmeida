package com.twu.book;

<<<<<<< HEAD
import com.twu.bookModel.AuthorName;
import com.twu.bookModel.Book;
import com.twu.bookModel.BookName;
import com.twu.bookModel.PublicationYear;
=======
import com.twu.types.book.AuthorName;
import com.twu.types.Name;
import com.twu.types.item.PublicationYear;
import com.twu.types.book.Book;
>>>>>>> 82928648e1b8131c3a3f9c02a4e3935261eba03a
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;


public class BookTest {
    private Book myBook;
    private static String BOOK_NAME = "O Vento";
    private static int PUBLICATION_YEAR =  1980;
    private static String AUTHOR_NAME = "João Simplicio";


    @Before
    public void setUp() throws Exception {
         this.myBook = new Book(new Name(BOOK_NAME),
                                new PublicationYear(PUBLICATION_YEAR),
                                new AuthorName(AUTHOR_NAME));
    }

    @Test
    public void shouldReturnBookName() throws Exception {
        assertThat(myBook.getBookName(), is(BOOK_NAME));
    }

    @Test
    public void shouldReturnAuthorName() throws Exception {
        assertThat(myBook.getAuthorName(), is(AUTHOR_NAME));
    }

    @Test
    public void shouldReturnPublicationYear() throws Exception {
        assertThat(myBook.getPublicationYear(), is(PUBLICATION_YEAR));
    }

}