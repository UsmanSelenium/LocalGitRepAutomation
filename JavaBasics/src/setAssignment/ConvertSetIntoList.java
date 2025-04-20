package setAssignment;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ConvertSetIntoList {
	public static void main(String args[]) {
		Set<String> itrset = new LinkedHashSet<String>();
		
		itrset.add("Usman");
		itrset.add("Ali");
		itrset.add("Baig");
		itrset.add("Moghal");
//Convert Set into List
		List<String> conList = new ArrayList<String>(itrset);
//get index value of particular element
		System.out.println("Element value from List: "+conList.get(2));
//Run loop
		for(int i=0;i<conList.size();i++) {
			System.out.println(conList.get(i));
		}

	}

}
