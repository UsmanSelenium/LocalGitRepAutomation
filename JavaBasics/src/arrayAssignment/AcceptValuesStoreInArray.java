package arrayAssignment;
/*
 * A user is shopping online and wants to enter the names of N products they want to buy. The program should:
1.	Accept the number of products from the user.
2.	Store product names in an array.
3.	Print the list of products.
 */

import java.util.Scanner;

public class AcceptValuesStoreInArray {
	public static void main(String args[]) {
// Step 1: Ask the user how many products they want to add
		Scanner sc = new Scanner(System.in);
		System.out.println("How many products you want to add");
		int nProducts = sc.nextInt();
		sc.nextLine();
// Step 2: Create an array to store product names
		String products[] = new String[nProducts];
// Step 3: Accept product names from the user
		for(int i=0;i<products.length;i++) {
//Asks the user to enter the name of product (i+1 
//(because arrays start at index 0, but users expect numbering from 1).
			System.out.print("Enter product " + (i + 1) + ": ");
			products[i] = sc.nextLine();
		}
// Step 4: Print the stored products
		for(String printProducts: products) {
			System.out.println("Products are : "+printProducts);
		}
		sc.close();		
	}
}
