package Java;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int mySalary=3000;
		
		int myBrotherSalary=4000;
		
		
		System.out.println("Before swapping My salary:"+mySalary);
		System.out.println("Before swapping My Brother salary:"+myBrotherSalary);
		
		System.out.println("***************************************");
		
		int temp = mySalary;
		
		mySalary=myBrotherSalary;
		
		myBrotherSalary=temp;
		
		System.out.println("After swapping My salary:"+mySalary);
		System.out.println("After swapping My Brother salary:"+myBrotherSalary);
		

	}

}
