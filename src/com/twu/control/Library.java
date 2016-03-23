package com.twu.control;



import com.twu.types.book.Book;
import com.twu.types.movie.Movie;
import java.util.ArrayList;
import java.util.Optional;


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


        // pq nao posso fazer isso?
//        itemsListInLibrary.stream().findFirst(itemLib -> {
//            if(itemLib.isAvailable()){
//                return itemLib;
//            }
//        });
//
//
//
//      for (ItemLibrary itemLibrary : itemsListInLibrary){
//            if ( itemIsEqualNameParameterAndItemIsAvailableInLibrary(itemLibrary, name)  ){
//                return   itemLibrary;
//            }
//        }
//        return null;

        Optional<ItemLibrary> result = itemsListInLibrary
                                            .stream()
                                            .filter(item -> item.isAvailable())
                                            .findFirst();
        if (result.isPresent())
            return result.get();

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

    // isItemAvailableToLend
    public boolean itemIsEqualNameParameterAndItemIsNotAvailableInLibrary(ItemLibrary itemLibrary, String name){
        return (  (itemLibrary.getItem().getName().equals(name) ) && (!itemLibrary.isAvailable()) );

    }

}