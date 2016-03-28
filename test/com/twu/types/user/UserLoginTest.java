package com.twu.types.user;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class UserLoginTest {
    private UserLogin userLogin;
    private String USER_NAME = "user_01";
    private String CORRECT_PASSWORD = "asdf-qwer";
    private String ERROR_PASSWORD = "qwer-ssd";


    @Before
    public void setUp() throws Exception {
        this.userLogin = new UserLogin(new UserName(USER_NAME), new UserPassword(CORRECT_PASSWORD));
    }

    @Test
    public void shouldReturnTrueWhenPassWordPassedIsCorrect(){
        assertThat(userLogin.passwordIsCorrect(CORRECT_PASSWORD), is (true));
    }

    @Test
    public void shouldReturnTrueWhenPassWordPassedIsNotCorrect(){
        assertThat(userLogin.passwordIsCorrect(ERROR_PASSWORD), is (false));
    }
}