/*
 *  UCF COP3330 Fall 2021 Application Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */

package baseline;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class ToDoListApplicationController implements Initializable {

    //holds two ArrayLists of SingleToDoLists
    //first is all the lists in the program
    //second is only added to when a list is selected by the user to be saved later
    private ArrayList<SingleToDoList> fullList;
    private ArrayList<SingleToDoList> selectedLists;

    //getter setters
    public ArrayList<SingleToDoList> getFullList() {return fullList;}
    public void setFullList(ArrayList<SingleToDoList> fullList) {this.fullList = fullList;}
    public ArrayList<SingleToDoList> getSelectedLists() {return selectedLists;}
    public void setSelectedLists(ArrayList<SingleToDoList> selectedLists) {this.selectedLists = selectedLists;}

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }


    /*
       private void addToDoList() {
            //adds a ToDoList to the application main list
        }

        private void removeToDoList(){
            //removes ToDoList from application main list
        }

        private void addToSelectedLists(){
            //lets user add a list to their selected Lists arrayList
        }

        private void removeFromSelectedLists(){
            //lets user remove a list from their selected Lists arrayList
        }

        private void saveLists(){
            //lets user save either all or selected lists
            //saves and writes them to a txt file
        }

        private void loadLists(){
            //allows user to load in lists from a txt file
        }
    */
}
