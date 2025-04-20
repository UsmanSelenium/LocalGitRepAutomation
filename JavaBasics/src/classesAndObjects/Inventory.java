package classesAndObjects;
//Create a Java class named Inventory to represent an inventory item.
//Instance Variables:
//Define the following public instance variables inside the Inventory class:
//String itemName - to store the name of the item.
//int quantity - to store the quantity of the item.
//double price - to store the price of the item.
//Object Interaction:
//In the main method, create an object of the Inventory class.
//Use the object to directly assign values to the instance variables.
//Use the object to retrieve and print the values of the instance variables.

public class Inventory {

//Instance/Class Variables - Declared inside the class outside the Main Method
	String itemName;
	int quantity;
	double price;
	
	public static void main(String args[])
	{
		Inventory obj = new Inventory();
		obj.itemName = "laptop";
		obj.quantity = 10;
		obj.price = 1200.50;
		
		System.out.println("Item Nae: "+ " "+obj.itemName);
		System.out.println("Quantity :"+ " "+obj.quantity);
		System.out.println("Price :"+ " "+obj.price);
		
	}

}
