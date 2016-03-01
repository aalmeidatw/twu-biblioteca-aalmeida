package com.twu.book;


import com.twu.message.MessageToConsole;
import com.twu.model.AuthorName;
import com.twu.model.BookName;
import com.twu.model.PublicationYear;
import java.util.ArrayList;


public class BookList {
    private ArrayList<Book> myBookList = new ArrayList<>();
    private MessageToConsole messageToConsole = new MessageToConsole();

     public void createBookList(){
        Book book1 = new Book(new BookName("Dom Quixote"),new AuthorName("Miguel de Cervantes"), new PublicationYear(1605), false);
        Book book2 = new Book(new BookName("Guerra e Paz"),new AuthorName("Liev Tolstói"), new PublicationYear(1869), true);
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
                if(book.isAvaliable() == true){
                    System.out.println(" -> " + myBookList.indexOf(book)  + " : " +   book.getBookName());
                }
        });
     }




    public void selectedBook(int key){
        sendBookNameToPrintInConsole(key);
        sendAuthorNameToPrintInConsole(key);
        sendPublicationYearToPrintInConsole(key);
    }

    private void sendAuthorNameToPrintInConsole(int key){
        messageToConsole.printMessageOnConsole("Book Name: " + this.myBookList.get(key).getAuthorName());
    }

    private void sendBookNameToPrintInConsole(int key){
        messageToConsole.printMessageOnConsole("Author Name: " + this.myBookList.get(key).getBookName());
    }

    private void sendPublicationYearToPrintInConsole(int key){
        messageToConsole.printMessageOnConsole("Publication Year: " + this.myBookList.get(key).getPublicationYear());
    }

    public void getCheckoutBook(int key){
        this.myBookList.remove(key);
    }

    public void deliverBook(){


    }





}
