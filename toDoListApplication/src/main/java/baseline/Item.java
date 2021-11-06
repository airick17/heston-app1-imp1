/*
 *  UCF COP3330 Fall 2021 Application Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */

package baseline;

public class Item {
    //an item holds these variables
    private String description;
    private String dueDate;
    private String isComplete;

    public Item(String description, String dueDate, String isComplete){
        this.description = description;
        this.dueDate  = dueDate;
        this.isComplete = isComplete ;
    }

    //getter setters
    public String getDescription() {return description;}
    public void setDescription(String description) {this.description = description;}
    public String getDueDate() {return dueDate;}
    public void setDueDate(String dueDate) {this.dueDate = dueDate;}
    public String getIsComplete() {return isComplete;}
    public void setIsComplete(String isComplete) {this.isComplete = isComplete;}


}