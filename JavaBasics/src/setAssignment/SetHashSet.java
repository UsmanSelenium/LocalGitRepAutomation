package setAssignment;
/*
remove(Object o)	Removes the specified element from the set
contains(Object o)	Returns true if the set contains the specified element
size()	Returns the number of elements in the set
isEmpty()	Returns true if the set is empty
clear()	Removes all elements from the set
 */
import java.util.HashSet;
public class SetHashSet {
	public static void main(String args[]) {
		
		HashSet<String> set1 = new HashSet<String>();
		set1.add("BMW");
		set1.add("Audi");
		set1.add("Benz");
		set1.add(null);
		set1.add("Chev");
		set1.add(null);
		System.out.println("Set Size: "+set1.size());
		System.out.println("Set Elements before Manipulations: "+set1);
//remove element
		set1.remove("Audi");
		System.out.println("Set Elements After removing 1 element: "+set1);
//check whether the element contains BMW or not
		boolean containsStr = set1.contains("BMW");
		System.out.println("Check whether BMW elements contains in set or not : "+containsStr);
//for each loop
		for(String values: set1) {
			System.out.println(values);
		}
//Check whether isEmpty or not
		boolean isEmptyStr = set1.isEmpty();
		System.out.println("Check whether Set is Empty or not : "+isEmptyStr);
//Clear Set
		set1.clear();
		isEmptyStr = set1.isEmpty();
		System.out.println("Check whether Set is Empty or not after clearing the set: "+isEmptyStr);	
		}

}
