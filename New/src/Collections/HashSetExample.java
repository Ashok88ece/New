package Collections;

import java.util.HashSet;

public class HashSetExample {
	
	//Not allowed Duplicates & No Guaranteed Order & Allow one Null Values
	//NO Thread Sage
	
  public static void main(String[] args) {
	  
    HashSet<String> cars = new HashSet<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("BMW");  // Duplicate
    cars.add("Mazda");
    System.out.println(cars);
    
    
    cars.contains("BMW");
    
    System.out.println(cars.contains("BMW"));
    
    cars.remove("BMW");
    System.out.println(cars);
    
    //cars.clear();//Remove all the values

    //System.out.println(cars);
    
    cars.size();
    System.out.println("Total number of Cars:"+cars.size());
    
    
    for(String i:cars) {
    	System.out.println(i);
    }
    
  }
}
