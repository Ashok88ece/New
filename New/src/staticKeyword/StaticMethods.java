package staticKeyword;

public class StaticMethods {
	
	//If Method name specified as static then we can access the method name directly
	//No need to create object to call the method
	
	public static void method1() {
		
		System.out.println("Method is Static");
	}

	public static void nonStatic() {
		
		System.out.println("Method is NonStatic");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		method1();
		//nonStatic();
		
		

	}

}
