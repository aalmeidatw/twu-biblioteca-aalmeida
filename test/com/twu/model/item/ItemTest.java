package com.twu.model.item;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;


public class ItemTest {
    private Item item;

    @Before
    public void setUp() throws Exception {
        this.item = new Item(new Name("Name"), new PublicationYear(0001));

    }

    @Test
    public void shouldReturnNameOfItem() throws Exception {
        assertThat(item.getName(), is("Name"));

    }

    @Test
    public void shouldReturnPublicationYearOfItem() throws Exception {
        assertThat(item.getPublicationYear(), is(0001));

    }

}