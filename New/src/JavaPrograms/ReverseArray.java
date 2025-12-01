package JavaPrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[]  myarray = {1,2,3,4,5,6};
		
		System.out.println("Original Array: "+ Arrays.toString(myarray));
		
		List<Integer> list = Arrays.asList(myarray);
		
		Collections.reverse(list);
		
		System.out.println("Reversed Array:" + Arrays.toString(myarray));

	}

}
