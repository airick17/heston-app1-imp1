/*
 *  UCF COP3330 Fall 2021 Application Assignment 1 Solution
 *  Copyright 2021 Eric Heston
 */

package baseline;

import javafx.beans.property.SimpleStringProperty;

public class Item{

    //an item holds these variables
    private final SimpleStringProperty description;
    private final SimpleStringProperty dueDate;
    private final SimpleStringProperty isComplete;

    public Item(String description, String dueDate, String isComplete){
        this.description = new SimpleStringProperty(description);
        this.dueDate = new SimpleStringProperty(dueDate);
        this.isComplete = new SimpleStringProperty(isComplete);
    }

    //getter setters probably won't need but maybe to edit an item
    public String getDescription() {return description.get();}
    public String getDueDate() {return dueDate.get();}
    public String getIsComplete() {return isComplete.get();}
}