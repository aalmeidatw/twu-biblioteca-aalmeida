package com.twu.menu;


import com.twu.control.Library;
import com.twu.provider.LibraryItems;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MenuLoginTest {
    private MenuLogin menuLogin;
    private Library library;
    private static String USER_NAME = "name_user01";
    private static String PASSWORD = "@qwer";
    private static String ERROR_PASSWORD = "@qweAr";


    @Before
    public void setUp() throws Exception {
        this.library = new Library(new LibraryItems().createItemListLibrary());
        this.menuLogin = new MenuLogin(library);

    }

    @Test
    public void shoudReturnTrueWhenUserAsAuthenticated() throws Exception {
        menuLogin.setUserStatus(USER_NAME, PASSWORD);
        assertThat(menuLogin.isUserAuthenticated(), is(true));
    }

    @Test
    public void shoudReturnTrueWhenUserAsNotAuthenticated() throws Exception {
        menuLogin.setUserStatus(USER_NAME, ERROR_PASSWORD);
        assertThat(menuLogin.isUserAuthenticated(), is(false));
    }
}