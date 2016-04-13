package com.twu.menu;

import com.twu.IO.MessagePrinter;
import com.twu.control.Library;
import com.twu.control.ManagementUser;
import com.twu.provider.LibraryItems;
import com.twu.types.Name;
import com.twu.types.book.AuthorName;
import com.twu.types.book.Book;
import com.twu.types.item.Item;
import com.twu.types.item.PublicationYear;
import com.twu.types.library.ItemLibrary;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import java.util.ArrayList;
import java.util.List;
import static org.mockito.Mockito.verify;
import static org.mockito.MockitoAnnotations.initMocks;


public class BookListMenuTest {
    private BookListMenu bookListMenu;
    private static String MESSAGE = "message to print";
    private static String NAME =  "name";
    private static int PUBLICATION_YEAR = 1244;
    private static String AUTHOR_NAME = "AUTHOR_NAME";
    private List<ItemLibrary> itemList = new ArrayList<>();

    @Mock
    MessagePrinter messagePrinterMock;
    Library libraryMock;
    ManagementUser managementUserMock;
    Item itemMock;
    ItemLibrary itemLibraryMock;

    @Before
    public void setUp() throws Exception {
        initMocks(this);

        this.libraryMock = new Library(new LibraryItems().createItemListLibrary(), managementUserMock);
        this.bookListMenu = new BookListMenu(libraryMock, messagePrinterMock);
        this.itemMock = new Book(new Name(NAME), new PublicationYear(PUBLICATION_YEAR), new AuthorName(AUTHOR_NAME));
        this.itemLibraryMock = new ItemLibrary(itemMock);

        this.itemList.add(itemLibraryMock);
     }

    @Test
    public void shouldTestIfPrintListIsCalled() throws Exception {
        bookListMenu.execute();
        verify(messagePrinterMock).printerItemList(itemList);
    }

    @Test
    public void shouldTestIfPrintIsCalled() throws Exception {
        bookListMenu.execute();
        verify(messagePrinterMock).print(MESSAGE);
    }
}