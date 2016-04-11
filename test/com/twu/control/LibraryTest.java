package com.twu.control;

import com.twu.exception.ErrorNameException;
import com.twu.provider.LibraryItems;
import com.twu.types.itemType.ItemType;
import com.twu.types.user.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import com.twu.types.library.ItemLibrary;

import java.util.List;

import static junit.framework.TestCase.assertSame;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertNull;


public class LibraryTest {
    private Library library;
    private ItemType itemType;
    private User user;
    private static String BOOK_NAME = "In Search of Lost Time";
    private static String BOOK_NAME_NOT_EXIST = "BookNotExist";
    private static String MOVIE_NAME = "Mad Max";
    private static String USER_NAME = "name_user01";
    private static String PASSWORD = "1111";
    private static String ERROR_PASSWORD = "@qweAr";


    @Before
    public void setUp() throws Exception {
        this.library = new Library(new LibraryItems().createItemListLibrary());
     }



    @Test
    public void shouldReturnItemWhenPassedItemName(){
        ItemLibrary item = library.getLibraryItem(MOVIE_NAME);
        assertThat(item.getItem().getName(), is(MOVIE_NAME));
    }

    @Test
    public void shouldReturnNullWhenBookNameIsNotFound() throws Exception {
        assertNull(library.getLibraryItem(BOOK_NAME_NOT_EXIST));
    }

    @Test
    public void shouldReturnTrueWhenIsUserAuthenticated(){
        assertThat(library.loginUser(USER_NAME, PASSWORD), is(true));
    }

    @Test
    public void shouldReturnFalseWhenIsUserIsNotAuthenticated(){
        assertThat(library.loginUser(USER_NAME, ERROR_PASSWORD), is(false));
    }

    @Test
    public void shouldReturnLibraryMovieList(){
        List<ItemLibrary> items = library.returnItemList(ItemType.MOVIE);
        assertThat(items.get(0).getItem().getName(), is(MOVIE_NAME));
    }

    @Test
    public void shouldReturnLibraryBookList(){
        List<ItemLibrary> items = library.returnItemList(ItemType.BOOK);
        assertThat(items.get(0).getItem().getName(), is(BOOK_NAME));
    }

    @Test
    public void shouldReturnUserPassedUserName(){
        this.user = library.getUser(USER_NAME);
        assertThat(user.getNameLogin(), is(USER_NAME));
    }

    @Test
    public void shouldReturnTrueWhenItemTypeIsBook(){
        assertThat(library.isBook(itemType.BOOK), is (true));
    }

    @Test
    public void shouldReturnFalseWhenItemTypeIsNotBook(){
        assertThat(library.isBook(itemType.MOVIE), is (false));
    }

    @Test
    public void shouldReturnTrueWhenItemTypeIsMovie(){
        assertThat(library.isMovie(itemType.MOVIE), is (true));
    }

    @Test
    public void shouldReturnFalseWhenItemTypeIsNotMovie(){
        assertThat(library.isMovie(itemType.BOOK), is (false));
    }

    @Test
    public void shouldReturnItemListOfReturn() throws Exception {
        library.lendItem(MOVIE_NAME);
        List<ItemLibrary> returnList = library.getAllItemsToReturn();

        assertThat(returnList.get(0).getItem().getName(), is(MOVIE_NAME));

    }



















}