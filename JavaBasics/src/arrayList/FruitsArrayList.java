package arrayList;

import java.util.ArrayList;
import java.util.List;

public class FruitsArrayList {
	public static void main(String args[]) {
//List Creation
		List <String> list = new ArrayList<String>();
//Adding Elements to the list		
		list.add("Mango");
		list.add("Apple");
		list.add("Pineapple");
		list.add("Mango");
		list.add("Orange");
		list.add("Grapes");
//Print elements with loop
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));		
		}
//Get only 1 element from the list
		System.out.println(list.get(2));
//Delete element from list
		list.remove(2);
		System.out.println(list);
//Update element into list
		list.set(3, "Banana");
		System.out.println("Elements after updating list: "+list);
//Print elements with for each loop
		for(String e:list) {
			System.out.println(e);		
		}
//Create one more list and add fruits list to it
				List <String> vlist = new ArrayList<String>();
//Adding previous list to new list
		vlist.addAll(list);
		vlist.add("Carrot");
		vlist.add("Brinjal");
		vlist.add("Pudina");
//Print the new list
		System.out.println(vlist);
	}
}
