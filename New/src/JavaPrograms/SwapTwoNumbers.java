package JavaPrograms;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=100; int y=200;
		System.out.println("Before Swap the int");
		System.out.println("Value of X:" +x + " Value of Y is:" +y);
		
		int temp = x;
		
		x=y;
		
		y = temp;
		System.out.println("After Swap the int");
		System.out.println("Value of X:"+ x  + " Value of Y:"+y);
		
		

	}

}
