package mapAssignment;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

//create a map to store Name, Address, Country elements

public class CreateMapToStoreNameAddressCountry {
	public static void main(String args[]) {
//Create a Map
		Map<String, String> personaldetails = new LinkedHashMap<String, String>();
//Add elements to the Map
		personaldetails.put("Name", "Usman");
		personaldetails.put("Address", "1114 King Carey Dr, St Louis, MO");
		personaldetails.put("Country", "USA");
//Print Map Elements
//Map elements can be printed using entrySet()
		for(Map.Entry<String, String> entry: personaldetails.entrySet()) {
			System.out.println(entry.getKey() +" "+ ": "+ entry.getValue());
		}
	}

}
