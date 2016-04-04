package com.twu.control;

import com.twu.provider.LibraryItems;
import com.twu.types.Name;
import org.junit.Before;
import org.junit.Test;
import com.twu.types.library.ItemLibrary;

import java.util.List;

import static com.sun.jmx.snmp.ThreadContext.contains;
import static junit.framework.TestCase.assertSame;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertNull;


public class LibraryTest {
    private Library library;
    private static String BOOK_NAME = "In Search of Lost Time";
    private static String BOOK_NAME_NOT_EXIST = "BookNotExist";
    private static String MOVIE_NAME = "Mad Max";

    @Before
    public void setUp() throws Exception {
        this.library = new Library(new LibraryItems().createItemListLibrary());
     }

    @Test
    public void shouldReturnTrueWhenItemAsAvailableToLend(){
        assertThat(library.isItemAvailableToLend(BOOK_NAME) , is(true));
    }

    @Test
    public void shouldReturnFalseWhenItemAsNotFound(){
        assertThat(library.isItemAvailableToLend(BOOK_NAME_NOT_EXIST) , is(false));
    }

    @Test
    public void shouldReturnFalseWhenItemAsNotAvailableToLend(){
        library.getLibraryItem(MOVIE_NAME).modifyAvailableItemStatus(false);
        assertThat(library.isItemAvailableToLend(MOVIE_NAME) , is(false));
    }

    @Test
    public void shouldReturnItemWhenPassedItemName(){
        ItemLibrary expected = library.getLibraryItem(BOOK_NAME);
        assertSame(library.getLibraryItem(BOOK_NAME), expected);
    }

    @Test
    public void shouldReturnNullWhenUAvailableItemObjectPassedStringIsFound() throws Exception {
        library.getLibraryItem(MOVIE_NAME).modifyAvailableItemStatus(false);
        assertNull(library.getLibraryItem(BOOK_NAME_NOT_EXIST));
    }

    @Test
    public void shouldLendItemPassedBookName(){
        library.lendItem(BOOK_NAME);
        assertThat(library.isItemAvailableToLend(BOOK_NAME), is(false));
    }

    @Test
    public void shouldLendItemPassedMovieName(){
        library.lendItem(MOVIE_NAME);
        assertThat(library.isItemAvailableToLend(MOVIE_NAME), is(false));
    }

    @Test
    public void shouldSetMovieAsAvailablePassedMovieName(){
        library.returnItem(MOVIE_NAME);
        assertThat(library.isItemAvailableToLend(MOVIE_NAME), is(true));
    }

    @Test
    public void shouldSetBookAsAvailablePassedBookName(){
        library.returnItem(BOOK_NAME);
        assertThat(library.isItemAvailableToLend(BOOK_NAME), is(true));
    }

    @Test
    public void shouldReturnLibraryBookList(){
        List<ItemLibrary> items = library.returnBookList();
        assertThat(items.get(0).getItem().getName(), is(BOOK_NAME));
    }


    @Test
    public void shouldReturnLibraryMovieList(){
        List<ItemLibrary> items = library.returnMovieList();
        assertThat(items.get(0).getItem().getName(), is(MOVIE_NAME));
    }



















}