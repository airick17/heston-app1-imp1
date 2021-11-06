/*
 *  UCF COP3330 Fall 2021 Application Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */

package baseline;

import java.util.ArrayList;

//single to do list class that holds items
public class ToDoList {
    //an arrayList of items makes up a ToDoList
    private ArrayList<Item> listOfItems;

    public ArrayList<Item> getListOfItems() {return listOfItems;}
    public void setListOfItems(ArrayList<Item> listOfItems) {
        this.listOfItems = listOfItems;}


    public void addItemToToDoList(Item addedItem){
        listOfItems.add(addedItem);
    }

}
