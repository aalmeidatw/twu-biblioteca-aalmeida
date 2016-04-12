package com.twu.menu;

import com.twu.control.Library;
import com.twu.control.ManagementUser;
import com.twu.provider.LibraryItems;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class LendItemMenuTest {
    private LendItemMenu lendItemMenu;
    private Library library;

    @Before
    public void setUp() throws Exception {
        this.library = new Library(new LibraryItems().createItemListLibrary(), new ManagementUser());
        this.lendItemMenu = new LendItemMenu(library);
    }

//    @Test
//    public void shouldLendBook() throws Exception{
//        lendItemMenu.execute();
//
//    }
}