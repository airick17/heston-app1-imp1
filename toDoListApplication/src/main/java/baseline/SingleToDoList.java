/*
 *  UCF COP3330 Fall 2021 Application Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */

package baseline;

import java.util.ArrayList;

public class SingleToDoList {
    //an arrayList of items makes up a ToDoList
    //ToDoList has a title
    private ArrayList<Item> ToDoList;

    //getter setters
    public ArrayList<Item> getToDoList() {return ToDoList;}
    public void setToDoList(ArrayList<Item> toDoList) {ToDoList = toDoList;}
}
