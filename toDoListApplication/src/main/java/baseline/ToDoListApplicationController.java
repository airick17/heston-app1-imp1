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
import javafx.scene.control.cell.TextFieldTableCell;
import java.net.URL;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

public class ToDoListApplicationController implements Initializable {

    //this configures the table view
    @FXML private TableView<Item> tableView;
    @FXML private TableColumn<Item, String> descriptionColumn;
    @FXML private TableColumn<Item, String> dueDateColumn;
    @FXML private TableColumn<Item, String> isCompleteColumn;
    @FXML private Button addItemButton;
    @FXML private TextArea descriptionTextArea;
    @FXML private DatePicker datePicker;
    @FXML private RadioButton radioButtonY;
    @FXML private RadioButton radioButtonN;
    @FXML private MenuItem loadListMenuTile;
    @FXML private Menu clearAllItemsMenuTile;
    @FXML private Label invalidLabel;

    //observable list for table view
    ObservableList<Item> data = FXCollections.observableArrayList();
    //single toDoList object to store data from table
    ToDoList toDoList = new ToDoList();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //initializes table view
        //sets up columns and makes them editable
        descriptionColumn.setCellValueFactory(new PropertyValueFactory<>("description"));
        descriptionColumn.setCellFactory(TextFieldTableCell.forTableColumn());

        //need to figure this out TODO
        descriptionColumn.setOnEditCommit(event -> {
            //tableView.getItems().get(tableView.getEditingCell().getRow()).setDescription(tableView.getAccessibleText());

        });

        dueDateColumn.setCellValueFactory(new PropertyValueFactory<>("dueDate"));
        dueDateColumn.setCellFactory(TextFieldTableCell.forTableColumn());

        isCompleteColumn.setCellValueFactory(new PropertyValueFactory<>("isComplete"));
        isCompleteColumn.setCellFactory(TextFieldTableCell.forTableColumn());
    }


    //when add item button is clicked
    @FXML private void addItemClick(ActionEvent e){
        //need to fix problem where date has to be selected
        addItemToLists();
        //resets table view to new list
        tableView.setItems(toDoList.getMainList());
    }

    //opens the file chooser and lets user select a file to load
    @FXML
    public void setLoadListMenuTileClick(ActionEvent e){
       toDoList.loadList();
    }

    //opens the file chooser and lets user select a file to save to
    @FXML
    public void setSaveListMenuTileClick(ActionEvent e){
        toDoList.saveList();
    }

    //clears the observable list and the local list
    @FXML
    public void clearAllItemsMenuClick(ActionEvent e){
        data.clear();
        toDoList.setMainList(data);
        tableView.refresh();
    }

    //creates new item and adds it to Observable list "data" and also to local toDoList
    private void addItemToLists() {
        //checks if description has info and if it is 256 chars or less
        //if it is it adds the item
        //if not it displays a label asking for a description
        if (!validateAndGetDescription().equals("")){
            Item item = new Item(validateAndGetDescription(),checkAndThenSetDate(),checkRadioButtons());
            //adds item to table view list
            data.add(item);
            //adds to local storage
            addToStorage(item);
            invalidLabel.setText(null);
            //refreshes table view and resets all controls used
            refreshAllControls();
        }
        else{
            invalidLabel.setText("Please enter a valid description.");
        }
    }

    //makes sure description is there, and it is between 1 and 256 characters so 2-255?
    public String validateAndGetDescription(){
        String description = descriptionTextArea.getText().trim();
        if (description.equals("") || description.length()>256){
            description = "";
        }
        return description;
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

    // adds item to the data observable list and then updates the stored ToDoList
    private void addToStorage(Item item) {
        toDoList.setMainList(data);
        //for testing purposes
        System.out.println("item added");
        System.out.println(toDoList.getMainList());
    }

    //resets the text fields and buttons
    private void refreshAllControls() {
       // tableView.refresh();
        descriptionTextArea.clear();
        radioButtonY.setSelected(false);
        radioButtonN.setSelected(false);
        datePicker.setValue(null);
    }

}


