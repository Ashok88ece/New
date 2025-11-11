package Operators;

public class RelationalOperator {
	
	/*
	 * == equal to – it returns true if both the left side and right side are equal
	 * != not equal to – it returns true if left side is not equal to the right side
	 * of operator > greater than – it returns true if left side is greater than
	 * right >= greater than or equal to – it returns true if left side is greater
	 * than or equal to right side < less than – it returns true if left side is
	 * less than right side <= less than or equal to – it returns true if left side
	 * is less than or equal to right side
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1=100;
		int num2=50;
		
		//== equal to operator
		System.out.println("Number1 and Number2 were equal num1==num2:"+(num1==num2));
		
		//!= Not equal to operator
		System.out.println("Number1 and Number2 were not equal num1!=num2:"+(num1!=num2));
		
		//>Greater than operator
		System.out.println("Number1 is Greater than Number2:"+(num1>num2));
		
		//<Less than operator
		System.out.println("Number1 is less than Number2:"+(num1<num2));
		
		//>= Greater than or equal to operator
		System.out.println("Number1 is greater than or equal to Number2:"+(num1>=num2));
		
		//<= Less than or equal to operator
		System.out.println("Number1 is less than or equal to Number2:"+(num1<=num2));
		

	}

}
