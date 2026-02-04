package javasample;

import java.util.Arrays;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3,67,2,5,6,4};
		
		Arrays.sort(arr);
		
		int max = arr[arr.length-1];
		
		System.out.println("Largest number in given array :"+max);

	}

}
