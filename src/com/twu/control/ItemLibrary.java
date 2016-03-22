package com.twu.control;

import com.twu.model.item.Item;



public class ItemLibrary {
    private Item item;
    private boolean isAvailable;

    public ItemLibrary(Item item){
        this.item = item;
        this.isAvailable = true;
    }

    public  Item getItem(){
        return this.item;
    }

    public void setAvailable(){
        this.isAvailable = true;
    }

    public void setIsNotAvailable(){
        this.isAvailable = false;
    }

    public boolean isAvailable(){
        return this.isAvailable;
    }


    @Override
    public String toString() {
        return "Item Name: " + item.getName();

    }
}
