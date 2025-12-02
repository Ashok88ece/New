package Arrays;

import java.util.Arrays;
import java.util.Collections;

public class ArraySortingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] arr = {"Orange","Pappaya","Guava","Apple","Banana"};
		
		//Arrays.sort(arr);
		
		//System.out.println("Array Sorting:"+Arrays.toString(arr));
		
		Arrays.sort(arr, Collections.reverseOrder());
		System.out.println("Array Descending Order:"+Arrays.toString(arr));

	}

}
