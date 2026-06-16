package JavaPrograms;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class MergeArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1= {1,3,5,7};
		int[] arr2= {2,4,6,8};
		
		int[] merged = new int[arr1.length + arr2.length];
		
		int index=0;
		
		for(int n:arr1)merged[index++]=n;
		for(int n:arr2)merged[index++]=n;
		
		for(int n:merged) {
			System.out.print(" "+n);
		}

	}

}
