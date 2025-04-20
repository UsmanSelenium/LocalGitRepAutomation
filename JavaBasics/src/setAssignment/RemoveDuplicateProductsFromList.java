package setAssignment;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateProductsFromList {
	public static void main(String args[]) {
//Create a duplicate list
		List<String> products = Arrays.asList("Mango","Apple","Grape","Banana","Mango","Grape");
		Set<String> uniqueProducts = new LinkedHashSet<String>();
		
		for(String Products: products) {
			uniqueProducts.add(Products);
		}
		System.out.println("Unique Products are: "+ uniqueProducts);
	}
}
