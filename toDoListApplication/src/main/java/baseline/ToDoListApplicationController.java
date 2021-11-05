/*
 *  UCF COP3330 Fall 2021 Application Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */

package baseline;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

public class ToDoListApplicationController extends ToDoListApplication {

    @FXML
    private Button displaySelect;

    @FXML
    private ListView<String> listviewMain;

    @FXML
    void clicked(ActionEvent e){
        System.out.println("You clicked me!");
    }


}
