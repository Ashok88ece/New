package JavaPrograms;

import java.util.Arrays;

public class SmallestNumberinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,8,19,7,29,5,90,4};
		
		Arrays.sort(arr);
		
		int min=arr[0];
		
		System.out.println("The Smallest Array in the Given value is: "+min);

	}

}
