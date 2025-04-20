package assignments;

//GroceryList Class - Manages the grocery list
class GroceryList {
 private static final int MAX_CAPACITY = 100; // Maximum number of items in the grocery list
 private String[] items; // Array to store grocery items
 
 public GroceryList() {
     items = new String[MAX_CAPACITY]; // Initialize the array with a fixed size of 100
 }
 
 // Method to add an item to the list
 public boolean addItem(String item) {
     for (int i = 0; i < MAX_CAPACITY; i++) { // Loop through the array to find an empty slot
         if (items[i] == null) { // Check for an empty slot
             items[i] = item; // Store the item in the first available slot
             return true; // Return true indicating the item was added successfully
         }
     }
     return false; // Return false if the list is full
 }
 
 // Method to remove an item based on display index
 public String removeItem(int displayIndex) {
     int actualIndex = getActualIndex(displayIndex); // Convert display index to actual array index
     if (actualIndex != -1) {
         String removedItem = items[actualIndex]; // Store the item to be removed
         items[actualIndex] = null; // Mark the slot as empty by setting it to null
         return removedItem; // Return the removed item
     }
     return "Invalid index"; // Return an error message if the index is invalid
 }
 
 // Method to view all items in the list
 public String viewItems() {
     StringBuilder list = new StringBuilder("Grocery List:\n"); // Create a StringBuilder to store the list
     int displayIndex = 1; // Initialize a counter for display numbering
     for (String item : items) { // Loop through the array
         if (item != null) { // Ignore null values (removed items)
             list.append(displayIndex).append(". ").append(item).append("\n"); // Append formatted item
             displayIndex++; // Increment the display index
         }
     }
     return list.toString(); // Return the formatted list
 }
 
 // Method to clear all items
 public void clearList() {
     for (int i = 0; i < MAX_CAPACITY; i++) { // Loop through the array
         items[i] = null; // Set all elements to null to clear the list
     }
 }
 
 // Helper method to get the actual index of an item
 private int getActualIndex(int displayIndex) {
     int count = 0; // Counter for non-null items
     for (int i = 0; i < MAX_CAPACITY; i++) { // Loop through the array
         if (items[i] != null) { // Count only non-null items
             count++;
             if (count == displayIndex) { // If the display index matches, return the actual index
                 return i;
             }
         }
     }
     return -1; // Return -1 if the index is invalid
 }
 
 // Helper method to check if the list is full
 public boolean isFull() {
     for (String item : items) { // Loop through the array
         if (item == null) { // If an empty slot is found, the list is not full
             return false;
         }
     }
     return true; // Return true if no empty slots are found
 }
 
 // Helper method to check if the list is empty
 public boolean isEmpty() {
     for (String item : items) { // Loop through the array
         if (item != null) { // If a non-null item is found, the list is not empty
             return false;
         }
     }
     return true; // Return true if all slots are empty
 }
}