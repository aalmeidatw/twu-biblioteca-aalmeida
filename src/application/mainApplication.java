package application;


import com.tw.message.BookList;
import com.tw.message.OutputMessages;

public class mainApplication {

    public static void main(String[] args) {
        OutputMessages outputMessages = new OutputMessages();
        BookList bookList = new BookList();


        outputMessages.welcomeMessage();
        bookList.createBookList();
        bookList.showBookList();


    }
}
