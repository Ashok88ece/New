package ExceptionHandling;

public class exceptionhandling {

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
	System.out.println("End");
	}

}
