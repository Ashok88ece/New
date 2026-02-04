package javasample;

import java.util.Arrays;

public class SmallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {55,45,33,22,67,33,11};
		
		Arrays.sort(arr);
		
		int min=arr[0];
		
		System.out.println("Smallest number of given array is :"+min);
		
		
	}

}
