package Polymorphism;

public class compiletimedemo2 {
	
	public void add(int a) {
		
		int sum=0;
		
		System.out.println("Single argument print the same value:"+sum);
		
	}
	
	public void add(int a,int b) {
		int sum=a+b;
		System.out.println("Sum of a+b:"+sum);
	}
	
	public void add(int a,int b,int c) {
		
		int sum=a+b+c;
		System.out.println("Sum of a+b+c:"+sum);
	}
	
	public static void main (String [] args) 
	{
		compiletimedemo2 obj = new compiletimedemo2();
		obj.add(0);
		obj.add(5, 6);
		obj.add(4, 5, 6);
	}

}
