package com.twu.menu;


import com.twu.control.Library;
import com.twu.control.ManagementUser;
import com.twu.provider.LibraryItems;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MenuLoginTest {
    private LoginMenu loginMenu;
    private Library library;
    private static String USER_NAME = "name_user01";
    private static String PASSWORD = "1111";
    private static String ERROR_PASSWORD = "@qweAr";


    @Before
    public void setUp() throws Exception {
        this.library = new Library(new LibraryItems().createItemListLibrary(), new ManagementUser());
        this.loginMenu = new LoginMenu(library);

    }

    @Test
    public void shouldReturnTrueWhenUserAsAuthenticated() throws Exception {
        loginMenu.setUserStatus(USER_NAME, PASSWORD);
        assertThat(loginMenu.isUserAuthenticated(), is(true));
    }

    @Test
    public void shouldReturnTrueWhenUserAsNotAuthenticated() throws Exception {
        loginMenu.setUserStatus(USER_NAME, ERROR_PASSWORD);
        assertThat(loginMenu.isUserAuthenticated(), is(false));
    }
}