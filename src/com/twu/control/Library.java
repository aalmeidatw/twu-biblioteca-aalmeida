package com.twu.control;



import com.twu.model.book.Book;
import com.twu.model.movie.Movie;
import java.util.ArrayList;


public class Library {
    private ArrayList<ItemLibrary> itemsListInLibrary = new ArrayList<>();



    public void getItemsLibrary(ArrayList<ItemLibrary> itemList){
        this.itemsListInLibrary = itemList;
    }



    public boolean checkoutItemInTheLibrary(String name){

        if (getAvailableItemInLibrary(name) != null){
            ItemLibrary item = getAvailableItemInLibrary(name);
            item.setIsNotAvailable();

            return true;
        }
        return false;
    }

    public boolean checkInItemInTheLibrary(String name){

        if (getUnAvailableItemInLibrary(name) != null){
            ItemLibrary item = getUnAvailableItemInLibrary(name);
            item.setAvailable();

            return true;
        }
        return false;

    }







    public void showAvailableMoviesListInTheLibrary(){
        itemsListInLibrary.stream().forEach(item ->{
            if((item.getItem() instanceof Movie) && (item.isAvailable()))       {
                System.out.println(item.getItem().getName());
            }});
    }


    public void showAvailableBooksListInTheLibrary(){
        itemsListInLibrary.stream().forEach(item ->{
            if( (item.getItem() instanceof Book)   && (item.isAvailable()) ){
                System.out.println(item.getItem().getName());
            }});
    }


    public ItemLibrary getAvailableItemInLibrary(String name) {

      for (ItemLibrary itemLibrary : itemsListInLibrary){
            if ( itemIsEqualNameParameterAndItemIsAvailableInLibrary(itemLibrary, name)  ){
                return   itemLibrary;
            }
        }
        return null;
    }


    public ItemLibrary getUnAvailableItemInLibrary(String name) {

        for (ItemLibrary itemLibrary : itemsListInLibrary){
            if(!itemIsEqualNameParameterAndItemIsNotAvailableInLibrary(itemLibrary, name)){
                return   itemLibrary;
            }
        }
        return null;
    }




    public boolean itemIsEqualNameParameterAndItemIsAvailableInLibrary(ItemLibrary itemLibrary, String name){
        return (  (itemLibrary.getItem().getName().equals(name) ) && itemLibrary.isAvailable() );

    }

    public boolean itemIsEqualNameParameterAndItemIsNotAvailableInLibrary(ItemLibrary itemLibrary, String name){
        return (  (itemLibrary.getItem().getName().equals(name) ) && (!itemLibrary.isAvailable()) );

    }

}