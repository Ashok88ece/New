package JavaPrograms;

import java.util.Arrays;

public class LargestNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {10,18,28,38,48,58,68,78,89,99};
		
		Arrays.sort(arr);
		
		int max = arr[arr.length-1];
		
		System.out.println("The Largest Number in Given Array is: "+max);

	}

}
