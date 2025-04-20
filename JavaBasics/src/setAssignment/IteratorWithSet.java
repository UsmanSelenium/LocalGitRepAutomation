package setAssignment;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class IteratorWithSet {
	public static void main(String args[]) {
		Set<String> itrset = new LinkedHashSet<String>();
		
		itrset.add("Usman");
		itrset.add("Ali");
		itrset.add("Baig");
		itrset.add("Moghal");
//Create an Iterator
		Iterator<String> itr = itrset.iterator();
//Run loop with iterator
		while(itr.hasNext()) {
			String values = itr.next();
			System.out.println("Elements of set are: "+ values);
		}
	}

}
