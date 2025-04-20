package generalAssignments;

import java.util.LinkedHashSet;

public class FindDuplicatesInAnArray {
	public static void main (String args[]) {
		//Crean an array with duplicate numbers
		int [] arr = {1,2,3,4,5,1,3,5};
		
		//To find out duplicate, we need to use Set Collection
		//I am going with LinkedHasSet to make sure it is in order and also find the duplicates
		LinkedHashSet<Integer> dup = new LinkedHashSet<Integer>();
		System.out.println("Array before identifying duplicates : "+arr);
		
		//Loop the array to find the duplicate values
		for(int arrs: arr) {
			if(dup.add(arrs) == false) {
				System.out.println("Duplicate numbers are :"+arrs);									
			} else {
				System.out.println("The original set is : "+arrs);
			}
		}
	}

}
