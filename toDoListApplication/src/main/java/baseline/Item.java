/*
 *  UCF COP3330 Fall 2021 Application Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */

package baseline;

public class Item {
    //an item holds these variables
    private int itemNum;
    private String description;
    private String dueDate;
    private boolean isComplete = false;

    //getter setters
    public int getItemNum() {return itemNum;}
    public void setItemNum(int itemNum) {this.itemNum = itemNum;}
    public String getDescription() {return description;}
    public void setDescription(String description) {this.description = description;}
    public String getDueDate() {return dueDate;}
    public void setDueDate(String dueDate) {this.dueDate = dueDate;}

    public boolean isComplete() {return isComplete;}
    public void setComplete(boolean complete) {isComplete = complete;}

    public void changeDescription(){
        //allows user to modify item description
    }

    public void changeDueDate(){
        //allows user to modify item due date
    }

    public boolean checkComplete(){
        //checks if item is completed
        return false;
    }

    public void save(){
        //allows user to save changes to an item
    }
}