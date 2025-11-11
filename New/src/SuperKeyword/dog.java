package SuperKeyword;

public class dog extends animal {
	
	String color = "White";
	
	void printColor() {
		System.out.println(color);
		System.out.println(super.color);//[super keyword can be used to refer to the immediate parent class instance variable.]
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		dog d = new dog();
		d.printColor();

	}

}
