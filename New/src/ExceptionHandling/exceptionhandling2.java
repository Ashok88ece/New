package ExceptionHandling;

import java.util.InputMismatchException;

public class exceptionhandling2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Start");
		try {
			int c=10/0;
			
			System.out.println("Division Result is:"+c);

		}
		
		catch(ArithmeticException e){
			
			System.out.println("Something went wrong please check exception"+e.getMessage());
			System.out.println("Seems You have provided value 0,Please provide more than 0");
			
		}
		
		catch(InputMismatchException e) {
			System.out.println("Hey Please enter only integer ");
		}
		catch(Exception e) {
			System.out.println("SomeThing Went Wrong");
		}
	
		finally {
			
			System.out.println("Finally Block");
			System.out.println("Program Ends");
		}
	}


	}


