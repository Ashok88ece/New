package Polymorphism;

public class CompileDemo {

	public static void main(String[] args) {
		
		//Compile Time Polymorphism/Early Binding/Method Overloading
		
		CompileDemo obj1 = new CompileDemo();
		obj1.add(10, 20);
		obj1.add(10, 20, 30);
		obj1.add(10, 109.25);
		obj1.add(10.5, 50);
		obj1.add(10.5,20.5);
		
	}
	
	public void add(double a,int b) {
		
		double sum=a+b;
		System.out.println("Sum of numbers is " +sum);
	}
	
	
     public void add(int a,double b) {
		
		double sum=a+b;
		System.out.println("Sum of numbers is " +sum);
	}
	
	
	public void add(int a,int b) {
		
		int c=a+b;
		System.out.println("Sum of numbers is " +c);
	}
	
   public void add(int a,int b,int c) {
		
		int d=a+b+c;
		System.out.println("Sum of numbers is " +d);
	}
   
   public void add(double a, double b) {
	   double c = a+b;
		   System.out.println("Sum of numbers is :"+c);
   }


}
