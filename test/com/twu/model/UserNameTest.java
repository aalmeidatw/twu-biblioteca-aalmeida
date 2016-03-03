package com.twu.model;


import com.twu.model.user.UserName;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class UserNameTest {
    private UserName userName;

    @Before
    public void setUp() throws Exception {
        this.userName = new UserName("aalmeida");
    }

    @Test
    public void shouldReturnUserName() throws Exception {
        assertThat(userName.getName(), is("aalmeida"));
    }


}