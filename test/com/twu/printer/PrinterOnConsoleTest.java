package com.twu.printer;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class PrinterOnConsoleTest {
    private PrinterOnConsole printer;
    private ByteArrayOutputStream outputStream;

    @Before
    public void setUp() throws Exception {
        this.printer = new PrinterOnConsole();
        this.outputStream = new ByteArrayOutputStream();
    }

    @Test
    public void shouldReturnMessageToPrint() throws Exception {
        System.setOut(new PrintStream(outputStream));
        String expected = "Welcome to Bangalore Public Library" + "\n";

        printer.printerMessageOnConsole("Welcome to Bangalore Public Library");
        assertEquals(expected, outputStream.toString());
    }
}