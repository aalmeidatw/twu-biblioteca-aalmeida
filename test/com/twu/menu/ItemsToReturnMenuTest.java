package com.twu.menu;

import com.twu.IO.MessagePrinter;
import com.twu.control.Library;
import com.twu.control.ManagementUser;
import com.twu.provider.LibraryItems;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import static org.mockito.Mockito.*;
import static org.mockito.MockitoAnnotations.initMocks;

public class ItemsToReturnMenuTest {
    private Library library;
    private static String MOVIE_NAME = "Mad Max";
    private ItemsToReturnMenu itemsToReturnMenu;


    @Mock
    MessagePrinter messagePrinterMock;

    @Before
    public void setUp() throws Exception {
        initMocks(this);

        this.library = new Library(new LibraryItems().createItemListLibrary(), new ManagementUser());
        this.itemsToReturnMenu = new ItemsToReturnMenu(library);
    }

    @Test
    public void shouldExecutePrintMethod(){
        itemsToReturnMenu.execute();
        verify(messagePrinterMock).print(MOVIE_NAME);
    }
}