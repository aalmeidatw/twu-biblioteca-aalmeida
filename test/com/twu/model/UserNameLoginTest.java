package com.twu.model;


import com.twu.model.user.UserNameLogin;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class UserNameLoginTest {
    private UserNameLogin userNameLogin;

    @Before
    public void setUp() throws Exception {
        this.userNameLogin = new UserNameLogin("aalmeida");
    }

    @Test
    public void shouldReturnUserName() throws Exception {
        assertThat(userNameLogin.getName(), is("aalmeida"));
    }


}