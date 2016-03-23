package com.twu.control;


import com.twu.types.book.Book;
import com.twu.types.book.AuthorName;
import com.twu.types.item.Item;
import com.twu.types.item.Name;
import com.twu.types.item.PublicationYear;
import com.twu.types.movie.DirectorName;
import com.twu.types.movie.Movie;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static junit.framework.TestCase.assertSame;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;


public class LibraryTest {
    Library library;
    ArrayList<Item> itemsList = new ArrayList<>();
    ArrayList<ItemLibrary> itemsInLibrary = new ArrayList<>();


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

        library.getItemsLibrary(itemsInLibrary);

     }


    @Test
    public void shouldPrinterOnlyListOfBookNames(){
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        library.showAvailableBooksListInTheLibrary();

        String expectedOutput = "In Search of Lost Time\n";
        assertThat(outContent.toString(), is(expectedOutput));
}
    @Test
    public void shouldPrinterOnlyListOfMovieNames(){
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        library.showAvailableMoviesListInTheLibrary();

        String expectedOutput = "Mad Max\n";
        assertThat(outContent.toString(), is(expectedOutput));
    }

    @Test
    public void shouldReturnTrueWhenItemAsFound(){
        assertThat(library.checkoutItemInTheLibrary("Mad Max"), is (true));
    }

    @Test
    public void shouldReturnFalseWhenItemAsNotFound(){
        assertThat(library.checkoutItemInTheLibrary("Mad Maxxx"), is (false));
    }

    @Test
    public void shouldReturnTrueWhenNameParameterIsEqualAndIsAvailable(){
        assertThat(library.itemIsEqualNameParameterAndItemIsAvailableInLibrary(itemsInLibrary.get(1),"Mad Max") , is(true));
    }

    @Test
    public void shouldReturnFalseWhenNameParameterIsEqualAndIsNotAvailable(){
        itemsInLibrary.get(1).setIsNotAvailable();
        assertThat(library.itemIsEqualNameParameterAndItemIsAvailableInLibrary(itemsInLibrary.get(1),"Mad Max") , is(false));
    }

    @Test
    public void shouldReturnFalseWhenNameParameterisNotEqual(){
        assertThat(library.itemIsEqualNameParameterAndItemIsAvailableInLibrary(itemsInLibrary.get(1),"Mad Maxx") , is(false));
    }


    @Test
    public void shouldReturnTrueWhenNameParameterIsEqualAndItemIsNotAvailable(){
        itemsInLibrary.get(1).setIsNotAvailable();
        assertThat(library.itemIsEqualNameParameterAndItemIsNotAvailableInLibrary(itemsInLibrary.get(1),"Mad Max") , is(true));
    }

    @Test
    public void shouldReturnFalseWhenNameParameterIsEqualAndItemIsAvailable(){
        assertThat(library.itemIsEqualNameParameterAndItemIsNotAvailableInLibrary(itemsInLibrary.get(1),"Mad Max") , is(false));
    }

    @Test
    public void shouldReturnFalseWhenNameParameterisNotEqualInLibrary(){
        assertThat(library.itemIsEqualNameParameterAndItemIsNotAvailableInLibrary(itemsInLibrary.get(1),"Mad Maxx") , is(false));
    }

    @Test
    public void shouldReturnAvailableItemObjectPassedString() throws Exception {
        assertSame(itemsInLibrary.get(1), library.getAvailableItemInLibrary("Mad Max"));
    }

    @Test
    public void shouldReturnNullWhenAvailableItemObjectPassedStringIsNotFound() throws Exception {
        assertNull(library.getAvailableItemInLibrary("Mad Maxxx"));
    }

    @Test
    public void shouldReturnNotNullWhenAvailableItemObjectPassedStringIsFound() throws Exception {
        assertNotNull(library.getAvailableItemInLibrary("Mad Max"));
    }

    @Test
    public void shouldReturnUnAvailableItemObjectPassedString() throws Exception {
        itemsInLibrary.get(1).setIsNotAvailable();
        assertSame(itemsInLibrary.get(0), library.getUnAvailableItemInLibrary("Mad Max"));
    }

    @Test
    public void shouldReturnNullWhenUAvailableItemObjectPassedStringIsNotFound() throws Exception {
        itemsInLibrary.get(1).setIsNotAvailable();
        assertNull(library.getAvailableItemInLibrary("Mad Maxxx"));
    }

    @Test
    public void shouldReturnNotNullWhenUAvailableItemObjectPassedStringIsFound() throws Exception {
        itemsInLibrary.get(1).setIsNotAvailable();
        assertNotNull(library.getUnAvailableItemInLibrary("Mad Max"));
    }

    @Test
    public void shouldReturnTrueWhenItemUnAvailableIsFound(){
        itemsInLibrary.get(1).setIsNotAvailable();
        assertThat(library.checkInItemInTheLibrary("Mad Max"), is (true));
    }

    @Test
    public void shouldReturnFalseWhenItemUnAvailableIsNotFound(){
        assertThat(library.checkInItemInTheLibrary("Mad Maxxx"), is (true));
    }







}