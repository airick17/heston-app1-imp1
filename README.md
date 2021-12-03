Code Explanation / Demonstration Video: https://youtu.be/dEEQxK1sbUM

ToDoListApplication User Guide:

This application is a todo list manager. It allows a user to add items to a todo list that have a required description 
field, and an optional due date and, is completed field.
After adding a todo item or items the user can then edit the fields of each item directly withing the table of items. 
The user can also remove an item from the list as well as sort the information in different ways. The user is also able
to save the list as a txt file in a location they specify. These txt files can then be loaded by the user directly into
the todo list application.

Adding an item:
    -First fill out the required item description field with a brief description of the todo item. An item with no
     description or with a description over 256 characters long can not be added to the list. 
    -Next if the user wants to, select a radio button that marks if the todo item has been completed yet. Select the Y 
     button if it has been completed, and the N button if it hasn't. Note that if both buttons are selected the 
     application will mark the item as completed.
    -Next if the user wants to, use the date picker box to select a due date for the todo item. If the user chooses not
     to select a date then no date will be used. 
    -Once the required and or optional fields are filled out click the add item button under the table. 
    -The user's todo item will now be added to the table in the next available row. 

Removing an item:
    -Once the user either loads a todo list or creates one, they can remove an item if they wish.
    -To remove an item simply click on the items row in the table, this will highlight that row / item.
    -Next click the remove selected item button.
    -The highlighted item will be removed from the list.

Clearing list of all items:
    -Once the user either loads a todo list or creates one, they can clear all the items if they wish.
    -To clear all items click the edit menu tile located at the top of the application.
    -Next in the edit menu select the clear all items tile.
    -The list will now be cleared of all items, as if the application was just opened.

Editing an item:
    -The user is able to edit the todo list item's description, due date, and completion status directly in the table.
    -To edit an item the user must double-click on the item element that they wish to edit.
    -The table will highlight the element and a text field will be created.
    -The user can now erase or edit the element.
    -Click outside the edited element and the table will be updated.

Mark an item as complete:
    -An item's status can be changed from incomplete to complete.
    -To mark an item as complete click on the items completed? element in the table.
    -Change the value from N to Y.
    -The item is now marked as complete.
    -To mark an item as incomplete click on the items completed? element in the table.
    -Change the value from Y to N.
    -The item is now marked as incomplete.

Display all existing items:
    -The user can choose to view all items in the todo list.
    -To view all items select the view menu tile at the top of the application.
    -In the view menu select display all.
    -Now all items whether complete, incomplete, or without completion status will be displayed.

Display only incomplete items:
    -The user can choose to view only the incomplete items in the todo list.
    -To view the incomplete items select the view menu tile at the top of the application. 
    -In the view menu select display incompleted.
    -Now only incomplete items will be displayed. 

Display only completed items:
    -The user can choose to view only the completed items in the todo list.
    -To view the completed items select the view menu tile at the top of the application.
    -In the view menu select display completed.
    -Now only completed items will be displayed. 

Saving a todo list:
    -The user can choose to save the current todo list to be loaded at a later time.
    -To save a todo list select the file menu tile in the menu bar at the top of the application.
    -Next select the menu option save list.
    -This will open up a save dialog window. 
    -The list has to be saved in a .txt file so that is the only option given to the user.
    -The user can name the file whatever they like.
    -Once the desired file name and location is entered click save.
    -The list is now saved in txt format at the user specified location with the user specified file name. 

Loading a todo list:
    -The user can choose to load a previously saved todo list from within the application.
    -If the user already has a todo list loaded it will be cleared from the table and the loaded list will be shown instead.
    -To load a todo list select the file menu tile in the menu bar at the top of the application.
    -Next select the load list menu tile in the file menu.
    -This will open up a save dialog window.
    -The user can then browse for a todolist .txt file and select the one they wish to load.
    -When the desired file is selected click open.
    -The todo list will now be loaded into the application. 

