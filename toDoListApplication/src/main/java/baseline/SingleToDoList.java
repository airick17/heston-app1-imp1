
package baseline;

import java.util.ArrayList;

public class SingleToDoList {
    //an arrayList of items makes up a ToDoList
    //ToDoList has a title
    private String title;
    private ArrayList<Item> ToDoList;

    //getter setters
    public ArrayList<Item> getToDoList() {return ToDoList;}
    public void setToDoList(ArrayList<Item> toDoList) {ToDoList = toDoList;}
    public String getTitle() {return title;}
    public void setTitle(String title) {this.title = title;}

    public void renameToDoList() {
        //changes Title of toDoList
    }

    public void addItem(){
        //adds a new item to the list
    }

    public void removeItem(){
        //removes item from list
    }

    public void displayAllItems(){
        //gets all the ToDoList items and shows them to user
    }

    public void displayCompletedItems(){
        //displays all items that has a true bool isCompleted
    }

    public void displayUncompletedItems(){
        //displays all items where bool isCompleted is false
    }

    public void save(){
        //saves users changes to the List
    }
}