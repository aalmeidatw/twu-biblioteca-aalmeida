package com.twu.control;

import com.twu.types.item.Item;
import com.twu.types.item.Name;
import com.twu.types.item.PublicationYear;
import com.twu.types.library.ItemLibrary;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


public class ItemLibraryTest {
    ItemLibrary itemLibrary;

    @Before
    public void setUp() throws Exception {
        this.itemLibrary = new ItemLibrary(new Item(new Name("Name1"), new PublicationYear(1900)));
     }

    @Test
    public void shouldSetItemAsNotAvailable() throws Exception {
        itemLibrary.setIsNotAvailable();
        assertThat(itemLibrary.isAvailable(), is(false));
    }

    @Test
    public void shouldSetItemAsAvailable() throws Exception {
        itemLibrary.setIsNotAvailable();
        itemLibrary.setAvailable();
        assertThat(itemLibrary.isAvailable(), is(true));
    }

    @Test
    public void shoudReturnTrueWhenItemAsAvailable(){
        assertThat(itemLibrary.isAvailable(), is (true));
    }

    @Test
    public void shouldReturItemName(){
        assertThat(itemLibrary.toString(), is("Item Name: Name1"));
    }

}