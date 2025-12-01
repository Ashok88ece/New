package JavaPrograms;

public class SwapTwoNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=40; int b= 50;
		
		System.out.println("Before swap value of A:"+a);
		System.out.println("Before swap value of B:"+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After swap value of A:"+a);
		System.out.println("After swap value of B:"+b);

	}

}
