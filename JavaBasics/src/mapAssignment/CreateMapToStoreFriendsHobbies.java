package mapAssignment;

import java.util.HashMap;
import java.util.Map;

public class CreateMapToStoreFriendsHobbies {
	public static void main(String args[]) {
//Create Map
		Map<String, String> frndsHobbies = new HashMap<String, String>();
		frndsHobbies.put("Sumair", "Youtuber");
		frndsHobbies.put("Usman", "Fishing");
		frndsHobbies.put("Ameer", "Iflasipana");
//Print elements using loop
		System.out.println("Name ---- Hobby");
		for(Map.Entry<String, String> entry:frndsHobbies.entrySet()) {
			System.out.println(entry.getKey() + "--> "+ entry.getValue() );			
		}		
	}
}
