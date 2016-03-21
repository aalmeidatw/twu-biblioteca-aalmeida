package com.twu.model.movie;

import com.twu.model.item.Name;
import com.twu.model.item.PublicationYear;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;


public class MovieTest {
    Movie movie;

    @Before
    public void setUp() throws Exception {
        this.movie = new Movie(new Name("MovieName1"), new PublicationYear(1900), new DirectorName("Director1"), 10);
    }

    @Test
    public void shouldReturnDirectorName() throws Exception {
        assertThat(movie.getName(), is("MovieName1"));

    }

    @Test
    public void shouldReturnItemType() throws Exception {
        assertThat(movie.getPublicationYear(), is(1900));

    }

    @Test
    public void shouldRetunRateValue() throws Exception {
        assertThat(movie.getRate(), is(10));

    }
}