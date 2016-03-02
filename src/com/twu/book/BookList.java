package com.twu.book;


import com.twu.getInput.ScannerInputUser;
import com.twu.message.MessageToConsole;
import com.twu.model.AuthorName;
import com.twu.model.BookName;
import com.twu.model.PublicationYear;
import java.util.ArrayList;


public class BookList {
    private ArrayList<Book> myBookList = new ArrayList<>();
    private MessageToConsole messageToConsole = new MessageToConsole();
    ScannerInputUser scannerInputUser = new ScannerInputUser();

     public void createBookList(){
        Book book1 = new Book(new BookName("Dom Quixote"),new AuthorName("Miguel de Cervantes"), new PublicationYear(1605), true);
        Book book2 = new Book(new BookName("Guerra e Paz"),new AuthorName("Liev Tolstói"), new PublicationYear(1869), false);
        Book book3 = new Book(new BookName("A Montanha Mágica"),new AuthorName("Thomas Mann"), new PublicationYear(1924), true);
        Book book4 = new Book(new BookName("Ulisses"),new AuthorName("James Joyce"), new PublicationYear(1922), true);
        Book book5 = new Book(new BookName("Cem Anos de Solidão"),new AuthorName("Gabriel García Márquez"), new PublicationYear(1967), true);

         this.myBookList.add(book1);
         this.myBookList.add(book2);
         this.myBookList.add(book3);
         this.myBookList.add(book4);
         this.myBookList.add(book5);
}
    public void showBookList(){
        messageToConsole.printMessageOnConsole("List of Available Books! : ");

        this.myBookList.forEach(book ->{
                if(isAvailable(myBookList.indexOf(book))){
                    messageToConsole.printMessageOnConsole(" -> " + myBookList.indexOf(book)  + " : " +   book.getBookName());
                }
        });
     }

    public void showBookDetailInfo(int key){
        messageToConsole.printMessageOnConsole("Book info: ");
        sendBookNameToPrintInConsole(key);
        sendAuthorNameToPrintInConsole(key);
        sendPublicationYearToPrintInConsole(key);
    }

    private void sendAuthorNameToPrintInConsole(int key){
        messageToConsole.printMessageOnConsole("Author Name: " + this.myBookList.get(key).getAuthorName());
    }

    private void sendBookNameToPrintInConsole(int key){
        messageToConsole.printMessageOnConsole("Book Name: " + this.myBookList.get(key).getBookName());
    }

    private void sendPublicationYearToPrintInConsole(int key){
        messageToConsole.printMessageOnConsole("Publication Year: " + this.myBookList.get(key).getPublicationYear());
    }


    public void checkoutBook(){

        showBookList();
        int indexBook = scannerInputUser.getInputIndex();

        if (indexBook <= this.myBookList.size() - 1) {
            showBookDetailInfo(indexBook);
            getCheckoutBook(indexBook);
        }else
            messageToConsole.printMessageOnConsole("Book is not found.");
    }



    public void getCheckoutBook(int key){

        if (isAvailable(key)) {
            setNotAvailableBook(key);
            messageToConsole.successfulCheckoutMessage();
        }else {
            messageToConsole.unsuccessfulCheckoutMessage();
        }
    }

    private boolean isAvailable(int key){
        return this.myBookList.get(key).isAvailable() == true;
    }

    private void setNotAvailableBook(int key){
        this.myBookList.get(key).setAvailableBook(false);

    }

    private void setAvaliableBook(int key){
        this.myBookList.get(key).setAvailableBook(true);
    }

    public void bookReturn(){
        showBooksToReturn();
        messageToConsole.printMessageOnConsole("Select book a Return : ");
        int value = scannerInputUser.getInputIndex();

        if(!isAvailable(value)){
            setAvaliableBook(value);
            messageToConsole.printMessageOnConsole("Thank you for returning the book.");

        }else {
            messageToConsole.printMessageOnConsole("That is not a valid book to return.");
        }
    }

     private void showBooksToReturn(){
        messageToConsole.printMessageOnConsole("List of Books to Return : ");

        this.myBookList.forEach(book ->{
            if(!isAvailable(myBookList.indexOf(book))){
                messageToConsole.printMessageOnConsole(" -> " + myBookList.indexOf(book)  + " : " +   book.getBookName());
            }
        });



    }





}
