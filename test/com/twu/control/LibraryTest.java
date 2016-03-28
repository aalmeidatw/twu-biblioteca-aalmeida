package com.twu.control;


import com.twu.types.book.Book;
import com.twu.types.book.AuthorName;
import com.twu.types.item.Item;
import com.twu.types.item.Name;
import com.twu.types.item.PublicationYear;
import com.twu.types.library.ItemLibrary;
import com.twu.types.movie.DirectorName;
import com.twu.types.movie.Movie;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertSame;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;


public class LibraryTest {
    private Library library;
    private ArrayList<Item> itemsList = new ArrayList<>();
    private ArrayList<ItemLibrary> itemsInLibrary = new ArrayList<>();
    private ArrayList<ItemLibrary> movieList = new ArrayList<>();
    private ArrayList<ItemLibrary> bookList = new ArrayList<>();
    private final String BOOK_NAME1 = "In Search of Lost Time";
    private final String BOOK_NAME2 = "Mad Max";
    private final String BOOK_NAME_NOT_EXIST = "BookNotExist";



    @Before
    public void setUp() throws Exception {

        this.library = new Library();

        Item book1 = new Book(new Name("In Search of Lost Time"), new PublicationYear(1913), new AuthorName("Marcel Proust"));
        Item movie1 = new Movie(new Name("Mad Max"), new PublicationYear(2004), new DirectorName("George Miller"), 5);

        itemsList.add(book1);
        itemsList.add(movie1);



        itemsList.forEach(item -> {
            itemsInLibrary.add(new ItemLibrary(item));
        });

        library.setLibraryItems(itemsInLibrary);
        movieList.add(itemsInLibrary.get(1));
        bookList.add(itemsInLibrary.get(0));

     }



    @Test
    public void shouldReturnTrueWhenItemAsAvailableToLend(){
        assertThat(library.isItemAvailableToLend(BOOK_NAME1) , is(true));
    }

    @Test
    public void shouldReturnFalseWhenItemAsNotFound(){
        assertThat(library.isItemAvailableToLend(BOOK_NAME_NOT_EXIST) , is(false));
    }

    @Test
    public void shouldReturnFalseWhenItemAsNotAvailableToLend(){
        itemsInLibrary.get(1).setIsNotAvailable();
        assertThat(library.isItemAvailableToLend(BOOK_NAME2) , is(false));
    }

    @Test
    public void shouldReturnFalseWhenItemIsNotEqualNamePassed(){
        assertThat(library.compareItemName(itemsInLibrary.get(1), BOOK_NAME_NOT_EXIST), is (false));
    }

    @Test
    public void shouldReturnTrueWhenItemIsEqualNamePassed(){
        assertThat(library.compareItemName(itemsInLibrary.get(1), BOOK_NAME2), is (true));
    }

    @Test
    public void shouldReturnTrueWhenItemAsBook(){
        assertThat(library.isBook(itemsInLibrary.get(0)), is(true));
    }

    @Test
    public void shouldReturnFalseWhenItemAsNotBook(){
        assertThat(library.isBook(itemsInLibrary.get(1)), is(false));
    }

    @Test
    public void shouldReturnTrueWhenItemAsMovie(){
        assertThat(library.isMovie(itemsInLibrary.get(1)), is(true));
    }

    @Test
    public void shouldReturnFalseWhenItemAsNotMovie(){
        assertThat(library.isMovie(itemsInLibrary.get(0)), is(false));
    }

     @Test
    public void shouldReturnUnAvailableItemObjectPassedString() throws Exception {
        itemsInLibrary.get(1).setIsNotAvailable();
        assertSame(itemsInLibrary.get(1), library.getLibraryItem(BOOK_NAME2));
    }

    @Test
    public void shouldReturnNullWhenUAvailableItemObjectPassedStringIsFound() throws Exception {
        itemsInLibrary.get(1).setIsNotAvailable();
        assertNull(library.getLibraryItem(BOOK_NAME_NOT_EXIST));
    }















}