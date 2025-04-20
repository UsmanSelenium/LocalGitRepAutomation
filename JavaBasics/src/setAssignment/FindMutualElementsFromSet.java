package setAssignment;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindMutualElementsFromSet {
	public static void main(String args[]) {
		
		Set<String> friendA = new HashSet<>(Arrays.asList("Bob","John","David","Rachel"));
		Set<String> friendB = new HashSet<>(Arrays.asList("Connor","John","Jim","Rachel"));
		
		Set<String> commFrnds = new HashSet<String>();
		
		for (String friends: friendA) {
			if(friendB.contains(friends)) {
				commFrnds.add(friends);
			}
		}
		System.out.println("Common Friends are: "+ commFrnds);
	}
}
