package assignments;

import java.util.Scanner;

public class GroceryListManager {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); // Scanner object for user input
    GroceryList groceryList = new GroceryList(); // Create an instance of GroceryList
    int choice; // Variable to store user choice
    
    do {
        // Display menu options
        System.out.println("\nGrocery List Manager");
        System.out.println("1. Add Item");
        System.out.println("2. Remove Item");
        System.out.println("3. View Items");
        System.out.println("4. Clear List");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
        
        while (!scanner.hasNextInt()) { // Validate numeric input
            System.out.print("Invalid input! Please enter a number: ");
            scanner.next(); // Consume invalid input
        }
        choice = scanner.nextInt(); // Read user choice
        scanner.nextLine(); // Consume newline character
        
        switch (choice) {
            case 1:
                if (groceryList.isFull()) { // Check if the list is full
                    System.out.println("The list is full! Cannot add more items.");
                } else {
                    System.out.print("Enter item name: ");
                    String item = scanner.nextLine(); // Read item name
                    if (groceryList.addItem(item)) {
                        System.out.println("Item added successfully.");
                    } else {
                        System.out.println("Failed to add item.");
                    }
                }
                break;
            case 2:
                if (groceryList.isEmpty()) { // Check if the list is empty
                    System.out.println("The list is empty! No items to remove.");
                } else {
                    System.out.println(groceryList.viewItems()); // Display list
                    System.out.print("Enter item number to remove (0 to cancel): ");
                    while (!scanner.hasNextInt()) { // Validate numeric input
                        System.out.print("Invalid input! Please enter a number: ");
                        scanner.next(); // Consume invalid input
                    }
                    int index = scanner.nextInt(); // Read user input
                    if (index == 0) {
                        System.out.println("Removal canceled.");
                    } else {
                        String removedItem = groceryList.removeItem(index); // Remove item
                        if (!removedItem.equals("Invalid index")) {
                            System.out.println("Removed: " + removedItem);
                        } else {
                            System.out.println("Invalid item number!");
                        }
                    }
                }
                break;
            case 3:
                if (groceryList.isEmpty()) {
                    System.out.println("The list is empty!");
                } else {
                    System.out.println(groceryList.viewItems());
                }
                break;
            case 4:
                System.out.print("Are you sure you want to clear the list? (yes/no): ");
                String confirmation = scanner.nextLine();
                if (confirmation.equalsIgnoreCase("yes")) {
                    groceryList.clearList();
                    System.out.println("Grocery list cleared.");
                } else {
                    System.out.println("Clear action canceled.");
                }
                break;
            case 5:
                System.out.println("Exiting program. Goodbye!");
                break;
            default:
                System.out.println("Invalid choice! Please enter a number between 1 and 5.");
        }
    } while (choice != 5);
    
    scanner.close(); // Close scanner
}
}