package com.twu.model;

import com.twu.model.movieData.MovieName;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class MovieNameTest {
    private MovieName movieName;

    @Before
    public void setUp() throws Exception {
        this.movieName = new MovieName("A Pedra de Gelo");
    }

    @Test
    public void shouldReturnMovieName(){
        assertThat(movieName.getMovieName(), is("A Pedra de Gelo"));
    }
}