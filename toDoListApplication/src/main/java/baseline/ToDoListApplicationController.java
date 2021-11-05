package baseline;

import java.util.ArrayList;

public class ToDoListApplicationController extends ToDoListApplication {

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

}
