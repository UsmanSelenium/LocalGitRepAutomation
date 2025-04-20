package arrayList;

import java.util.ArrayList;
import java.util.List;

public class ConvertListToArray {
	public static void main(String args[]) {
//Create a list
		List<String>  list = new ArrayList<String>();
//Add elements to list
    			list.add("Mango");
				list.add("Apple");
				list.add("Pineapple");
				list.add("Mango");
				list.add("Orange");
				list.add("Grapes");
//Convert list to Array
		String[] array = list.toArray(new String[0]);
//print array using for each
		for(String arr: array) {
			System.out.println(arr);
		}
//print array using for loop
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
//Get 3rd element from the array
		System.out.println(array[3]);
	}

}
