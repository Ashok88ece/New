package JavaPrograms;

public class FindLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {1,4,3,34,21,67,44,33,22,11,89};
		
		int max=arr[0];//initialize max is the first element of array
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		
		System.out.println("Largest Number is :"+max);

	}

}
