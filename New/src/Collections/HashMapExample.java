package Collections;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,String> capitalCities = new HashMap<String,String>();
		capitalCities.put("India","Delhi");
		capitalCities.put("England","London");
		capitalCities.put("USA", "Washington");
		capitalCities.put("Bangladesh", "Dhaka");
		capitalCities.put("Srilanka","Colombo");
		capitalCities.put("USA", "Washington");
		capitalCities.put(null, null);
		
		System.out.println(capitalCities);
		
		System.out.println(capitalCities.get("India"));
		
		System.out.println(capitalCities.remove("India"));
		
		System.out.println(capitalCities);
		
		System.out.println(capitalCities.size());
		
		
		//For Each Loop - To print Key info
		
		for(String str:capitalCities.keySet()) {
			
			System.out.println(str);
		}
		
		//For Each Loop - To Print values
		
		for (String str:capitalCities.values()) {
			System.out.println(str);
		}
		
		//For Each Loop - To Print both Key Value Pairs
		
		for(String str:capitalCities.keySet()) {
			System.out.println("Key: " + str + " Values: " +capitalCities.get(str));
		}
		

	}

}
