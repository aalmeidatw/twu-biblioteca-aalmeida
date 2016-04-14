package com.twu.menu;

import com.twu.IO.MessagePrinter;
import com.twu.IO.ScannerInputUser;
import com.twu.control.Library;
import com.twu.control.ManagementUser;
import com.twu.provider.LibraryItems;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;


public class LendItemMenuTest {
    private LendItemMenu lendItemMenu;
    private static String MESSAGE = "message";


    @Mock
    ManagementUser managementUserMock;
    MessagePrinter messagePrintMock;
    Library libraryMock;
    LendItemMenu lendItemMenuMock;
    ScannerInputUser scannerMock;



     @Before
    public void setUp() throws Exception {
        initMocks(this);

        this.libraryMock = new Library(new LibraryItems().createItemListLibrary(), managementUserMock);
        this.lendItemMenu = new LendItemMenu(libraryMock, messagePrintMock,scannerMock);
    }



    public void shouldTestIfPrintIsCalled() throws Exception {

        Scanner scannerMock = mock(Scanner.class);
        when(scannerMock.nextLine()).thenReturn("Mad Max");



        lendItemMenu.execute();


//        String inputData = "Mad Max";
//        System.setIn(new ByteArrayInputStream(inputData.getBytes()));
//        System.setIn(System.in);


        verify(messagePrintMock).print(MESSAGE);

    }
}