package Collections;

import java.util.TreeSet;

public class TreeSetExample {
	
	//Order Maintained & Not allowed Duplicates

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<String> cars=new TreeSet<String>();
		cars.add("KIA");
		cars.add("WV");
		cars.add("BMW");
		cars.add("Honda");
		cars.add("Hundai");
		cars.add("TATA");
		cars.add("BMW");
		
		System.out.println(cars);
		
		System.out.println(cars.contains("Honda"));
		
		cars.remove("BMW");
		System.out.println(cars);
		
		//For Each Loop
		
		for(String car:cars) {
			System.out.println(car);
		}

	}

}
