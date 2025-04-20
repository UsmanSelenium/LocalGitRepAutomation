package mapAssignment;

import java.util.HashMap;

public class HashMapAssignment {
	public static void main(String[] args) {
//Create HashMap
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
//Add values 
		hm.put(101, "Usman");
		hm.put(102, "Ali");
		hm.put(103, "Baig");
		hm.put(104, "Moghal");
//Print values
		System.out.println(hm);
//Get Specific value
		System.out.println(hm.get(104));
//Remove Value
		System.out.println(hm.remove(103));
//Print values after removing
		System.out.println("Values after removing: "+hm);
	}

}
