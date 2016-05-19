package com.twu.bookModel;


import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class DirectorNameTest {
    private DirectorName directorName;

    @Before
    public void setUp() throws Exception {
        this.directorName = new DirectorName("Matthew Ferreira");
    }

    @Test
    public void shouldReturnDirectorName(){
        assertThat(directorName.getDirectorName(), is("Matthew Ferreira"));
    }
}