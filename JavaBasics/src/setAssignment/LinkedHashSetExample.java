package setAssignment;
import java.util.LinkedHashSet;
/*
remove(Object o)	Removes the specified element from the set
contains(Object o)	Returns true if the set contains the specified element
size()	Returns the number of elements in the set
isEmpty()	Returns true if the set is empty
clear()	Removes all elements from the set
 */
public class LinkedHashSetExample {
	public static void main(String args[]) {
		LinkedHashSet<String> lhset = new LinkedHashSet<String>();
		
		lhset.add("Hero150");
		lhset.add(null);
		lhset.add("Pulsar");
		lhset.add("Samuri");
		
		System.out.println(lhset);	
		boolean removedStr = lhset.remove("Samuri"); //Removes element from set
		System.out.println("Element removed or not: "+removedStr);
		boolean containsStr = lhset.contains("Hero150"); //Check whether set contains given element or not
		System.out.println("Contains Element: "+containsStr);
		System.out.println("Check the size of set: "+lhset.size());//Checks the size of set
		boolean setisempty = lhset.isEmpty();
		System.out.println("Checks whether the set is empty or not: "+setisempty);//Checks whether set is empty or not
		lhset.clear();//Clears the whole set elements
		setisempty = lhset.isEmpty();
		System.out.println("Check the set size after clearing: "+lhset.size());//Checks the size of set			
	}
}
