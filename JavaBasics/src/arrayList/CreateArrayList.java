package arrayList;

import java.util.ArrayList;

public class CreateArrayList {
	public static void main(String args[]) {
		
		ArrayList fruits = new ArrayList(); //Create ArrayList Object
		
		fruits.add("Apple"); // Add elements to ArrayList
		fruits.add("Banana");
		fruits.add("Grapes");
		fruits.add("Orange");		
		System.out.println(fruits.get(1)); //.get() is used to retrieve elements
		fruits.set(3, "Mango");
		System.out.println(fruits); // To print all elements
		
		ArrayList bikes = new ArrayList(); //Create 2nd ArrayList
		bikes.add("RX100");
		bikes.add("Suzuki Samurai");
		bikes.add("Pulsar");		
		bikes.set(2, "Hero Puch");// Update an element of ArrayList
		System.out.println("Before removing element: "+bikes);
		bikes.remove(2);
		System.out.println("After removing element: "+bikes);
		
		
		
		
	}

}
