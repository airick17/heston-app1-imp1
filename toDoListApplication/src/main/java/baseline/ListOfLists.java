package baseline;

import java.util.ArrayList;

public class ListOfLists {
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

}
