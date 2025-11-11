package Collections;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Insertion order maintained as we put
		//Duplicates Ignored - Keys Must Unique
		//Slightly Slower due to ordering
		
		LinkedHashMap<String,String> cities = new LinkedHashMap<String,String>();
		cities.put("TN","Chennai");
		cities.put("Maharastra", "Pune");
		cities.put("Kerela", "Kochi");
		cities.put("Karnataka", "Bangalore");
		cities.put("Telengana", "Hyd");
		cities.put("TN", "Chennai");
		
		System.out.println(cities);
		
		

	}

}
