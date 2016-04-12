package com.twu.menu;

import com.twu.control.Library;
import com.twu.control.ManagementUser;
import com.twu.provider.LibraryItems;
import com.twu.types.library.ItemLibrary;
import org.junit.Before;
import org.junit.Test;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ItemsToReturnMenuTest {
    private LoginMenu loginMenu;
    private Library library;
    private static String MOVIE_NAME = "Mad Max";

    @Before
    public void setUp() throws Exception {
        this.library = new Library(new LibraryItems().createItemListLibrary(), new ManagementUser());
        this.loginMenu = new LoginMenu(library);
    }

    @Test
    public void shouldReturnItemListOfReturn() throws Exception {
        library.lendItem(MOVIE_NAME);
        List<ItemLibrary> returnList = library.getAllItemsToReturn();

        assertThat(returnList.get(0).getItem().getName(), is(MOVIE_NAME));

    }
}