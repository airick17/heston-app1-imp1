/*
 *  UCF COP3330 Fall 2021 Application Assignment 1 Solution
 *  Copyright 2021 Eric Heston
 */

package baseline;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.stage.FileChooser;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//single to do list class that holds items
public class ToDoList {
    //observed list for table view
    private ObservableList<Item> mainList = FXCollections.observableArrayList();

    //getter setters
    public ObservableList<Item> getMainList() {return mainList;}
    public void setMainList(ObservableList<Item> mainList) {this.mainList = mainList;}

    //now saves the list as a CSV txt files that user can name in file chooser
    public void saveList() {
        FileChooser fc = new FileChooser();
        fc.setTitle("Save");
        fc.setInitialFileName("ToDoList");
        fc.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("txt files", "*.txt"));
        try {
            File selectedFile = fc.showSaveDialog(null);
            fc.setInitialDirectory(selectedFile.getParentFile());
            FileWriter writer = new FileWriter(selectedFile.getAbsolutePath());
            for(Item todo: mainList){
                writer.write(todo.getDescription() + "," + todo.getDueDate() + "," + todo.getIsComplete() + System.lineSeparator());
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //currently, allows for file selection nothing else
    public void loadList() {
        FileChooser fc = new FileChooser();
        fc.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("txt files", "*.txt"));
        File selectedFile = fc.showOpenDialog(null);
        fc.setTitle("Load");
        if(selectedFile != null){
            System.out.println("you selected a file");
            System.out.println(selectedFile.getAbsolutePath());
        }else{
            System.out.println("file is not valid");
        }
    }
}


