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
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class ToDoListApplicationController implements Initializable {

    //this configures the table view
    @FXML private TableView<Item> tableView;
    @FXML private TableColumn<Item, Integer> itemNumColumn;
    @FXML private TableColumn<Item, String> descriptionColumn;
    @FXML private TableColumn<Item, String> dueDateColumn;
    @FXML private TableColumn<Item, String> isCompleteColumn;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //initializes table view
        //sets up columns
        //might need to add type to <> IDK yet
        itemNumColumn.setCellValueFactory(new PropertyValueFactory<>("itemNum"));
        descriptionColumn.setCellValueFactory(new PropertyValueFactory<>("description"));
        dueDateColumn.setCellValueFactory(new PropertyValueFactory<>("dueDate"));
        isCompleteColumn.setCellValueFactory(new PropertyValueFactory<>("isComplete"));

        //load dummy data
        tableView.setItems(getItems());

    }

    public ObservableList<Item> getItems() {

        //dummy data
        ObservableList<Item> items = FXCollections.observableArrayList();
        items.add(new Item(1,"testing testing","1998-10-07","F"));
        items.add(new Item(2,"testing testing","1998-10-07","T"));
        items.add(new Item(3,"testing testing","1998-10-07","F"));
        items.add(new Item(4,"testing testing","1998-10-07","F"));

        return items;
    }
}
