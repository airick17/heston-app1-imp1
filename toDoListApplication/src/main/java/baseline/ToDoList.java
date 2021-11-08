/*
 *  UCF COP3330 Fall 2021 Application Assignment 1 Solution
 *  Copyright 2021 Eric Heston
 */

package baseline;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.stage.FileChooser;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import java.io.*;

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
        fc.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("text files", "*.txt", "*.docx"));
        fc.setTitle("Load");
        File selectedFile = fc.showOpenDialog(null);
        getMainList().clear();

        CSVReader csvReader;
        try {
            csvReader = new CSVReader(new FileReader(selectedFile.getAbsolutePath()));
            String[] line;
            while ((line = csvReader.readNext()) != null){
                Item temp = new Item(line[0], line[1],line[2]);
                getMainList().addAll(temp);
            }
        }catch (IOException | CsvValidationException e){
            e.printStackTrace();
        }
    }

}



