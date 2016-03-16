package com.twu.model;


import com.twu.model.movieData.Rate;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class RateTest {
    private Rate rate;


    @Before
    public void setUp() throws Exception {
        this.rate = new Rate(7);

    }

    @Test
    public void shouldReturnNumberRateWhenSendNumber7() throws Exception {
        assertThat(rate.getRate(), is(7));

    }
}