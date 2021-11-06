/*
 *  UCF COP3330 Fall 2021 Application Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */

package baseline;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import java.net.URL;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class ToDoListApplicationController implements Initializable {

    //this configures the table view
    @FXML private TableView<Item> tableView;
    @FXML private TableColumn<Item, Integer> itemNumColumn;
    @FXML private TableColumn<Item, String> descriptionColumn;
    @FXML private TableColumn<Item, String> dueDateColumn;
    @FXML private TableColumn<Item, String> isCompleteColumn;
    @FXML private Button addItemButton;
    @FXML private TextArea descriptionTextArea;
    @FXML private DatePicker datePicker;
    @FXML private RadioButton radioButtonY;
    @FXML private RadioButton radioButtonN;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //initializes table view
        //sets up columns
        descriptionColumn.setCellValueFactory(new PropertyValueFactory<>("description"));
        dueDateColumn.setCellValueFactory(new PropertyValueFactory<>("dueDate"));
        isCompleteColumn.setCellValueFactory(new PropertyValueFactory<>("isComplete"));
    }

    //when add item button is clicked
    @FXML private void addItemClick(ActionEvent e){
        //need to fix problem where date has to be selected
        Item item = new Item( descriptionTextArea.getText().trim(),checkAndThenSetDate(),checkRadioButtons());
        //adds item to table view
        tableView.getItems().add(item);
        //adding to storage??
        addToStorage(item);
        //refreshes table view and resets all controls used
        refreshAllControls();
    }

    //somehow adds item to the toDoList object
    private void addToStorage(Item item) {


    }

    //checks radio buttons and assigns proper string value
    public String checkRadioButtons(){
        String isCompleteString = "";
        if (radioButtonY.isSelected()){
            isCompleteString = "Y";
        }else if (radioButtonN.isSelected()) {
            isCompleteString = "N";
        }
        return isCompleteString;
    }
    //checks for null date picker and sets string value to empty if it is null
    //otherwise it actually sets the date in correct format
    public String checkAndThenSetDate(){
        String date;
        if(datePicker.getValue()==null)
            date = "";
        else
            date = datePicker.getValue().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        return date;
    }
    //resets the text fields and buttons
    private void refreshAllControls() {
        tableView.refresh();
        descriptionTextArea.clear();
        radioButtonY.setSelected(false);
        radioButtonN.setSelected(false);
        datePicker.setValue(null);
    }
}


