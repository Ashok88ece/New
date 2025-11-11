package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class arrayList {
	
	//Allow Duplicate & Maintain Insertion Order & No Thread Safe
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Benz");
		cars.add("BMW");
		cars.add("Audi");
		cars.add("Maruthi");
		cars.add("yBMW");
		cars.add("zMaruthi");
		
		cars.add(6, "MG");//Add element using index
		
		cars.set(2, "Toyota");//Modify element using index
		
		cars.remove(0);//Zero index element removed
		
		Collections.sort(cars);//Sorting the list of arrays
		
		//cars.clear(); // Clear all the elements which is in arraylist
		
		//cars.size();ArrayList Size
		
		//Looping the ArrayList
		
		for(int i=0;i<cars.size();i++) {
			System.out.println(" Cars List is:"+cars.get(i));
		}
		
		Collections.sort(cars);
		
		//Using For Each Loop
		
		for(String i:cars) {
			System.out.println("Using For Each Loop list: "+i);
		}
		//System.out.println("Get the Index wise Car name:"+cars.get(2));
		//System.out.println("List of cars:"+cars);
		//System.out.println("List of the Array Size:"+cars.size());

	}

}
