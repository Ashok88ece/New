package Collections;

import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<String,String> cities =new  TreeMap<String,String>();
		cities.put("TN","Chennai");
		cities.put("Maharastra", "Pune");
		cities.put("Kerela", "Kochi");
		cities.put("Karnataka", "Bangalore");
		cities.put("Telengana", "Hyd");
		cities.put("TN", "Chennai");
		//cities.put(null, null);
		
		System.out.println(cities);
		
		//System.out.println(cities.get("TN"));
		
		//System.out.println(cities.remove("TN"));
		
		//System.out.println(cities);
		
		//cities.clear();

		//System.out.println(cities);
		
		System.out.println(cities.size());
		
		//For Each Loop display the Key Values
		
		for(String i:cities.keySet()) {
			System.out.println("Keys : " + i + " Values: " +cities.get(i));
		}
	}

}
