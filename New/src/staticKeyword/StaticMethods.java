package staticKeyword;

public class StaticMethods {
	
	//If Method name specified as static then we can access the method name directly
	//No need to create object to call the method
	
	//If method name set as void then we have to create object to call the method
	
	public void method1() {
		
		System.out.println("Method is Static");
	}

	public static void nonStatic() {
		
		System.out.println("Method is NonStatic");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticMethods obj =new StaticMethods();
		
		
		obj.method1();
		nonStatic();
		
		

	}

}
