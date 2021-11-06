

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


    //when add item button is clicked
    @FXML private void addItemClick(ActionEvent e){
        //checks radio buttons and assigns proper string value
        String isCompleteString = "";
        if (radioButtonY.isSelected()){
            isCompleteString = "Y";
        }else if (radioButtonN.isSelected()) {
            isCompleteString = "N";
        }

        //creates the item now
        //need to fix problem where date has to be selected
        Item item = new Item( descriptionTextArea.getText().trim(),datePicker.getValue().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")),isCompleteString );
        //adds item to table view
        tableView.getItems().add(item);

        //trying to make a second list in a class and add item to that as well so i can save and load that list but not working
        itemsListMain().add(item);

        //refreshes table view and resets all controls used
        tableView.refresh();
        descriptionTextArea.clear();
        radioButtonY.setSelected(false);
        radioButtonN.setSelected(false);
        datePicker.setValue(null);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //initializes table view
        //sets up columns
        descriptionColumn.setCellValueFactory(new PropertyValueFactory<>("description"));
        dueDateColumn.setCellValueFactory(new PropertyValueFactory<>("dueDate"));
        isCompleteColumn.setCellValueFactory(new PropertyValueFactory<>("isComplete"));
    }

    //observable list for table view
    public ObservableList<Item> itemsListMain() {
        return FXCollections.observableArrayList();
    }

}

