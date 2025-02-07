package staticKeyword;

public class StaticBlock {
	//Within Static block code will be executed first
	
	static{
		
		System.out.println("Static Method 1");
	}
	
	static {
		System.out.println("Static Method 2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Inside Main method");

	}

}
