/*
 *  UCF COP3330 Fall 2021 Application Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */

package baseline;

import javafx.collections.ObservableList;

import java.util.ArrayList;

//single to do list class that holds items
public class ToDoList {
    //an arrayList of items makes up a ToDoList
    //trying to make a second list in a class and add item to that as well, so I can save and load that list but not working
    //observable list for table view

    //public ObservableList<Item> itemsListMain() {
       // return FXCollections.observableArrayList();

    public ArrayList<Item> itemsListMain;


    public ArrayList<Item> getItemsListMain() {
        return itemsListMain;
    }

    public void setItemsListMain(ArrayList<Item> itemsListMain) {
        this.itemsListMain = itemsListMain;
    }
}
