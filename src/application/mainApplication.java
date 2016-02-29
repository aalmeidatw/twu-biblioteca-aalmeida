package application;


import com.twu.book.BookList;
import com.twu.message.MessageToConsole;

public class mainApplication {

    public static void main(String[] args) {
        MessageToConsole messageToConsole = new MessageToConsole();
        BookList bookList = new BookList();


        messageToConsole.welcomeMessage();
        bookList.createBookList();
//        bookList.showBookList();
//        System.out.println("========================");
//        bookList.selectedBook(0);
//        System.out.println("========================");
        //bookList.getCheckoutBook(0);
        //System.out.println("========================");
        //bookList.showBookList();



    }
}
