package Java;

public class Sample {
	
	public void method1() {
		System.out.println("Method 1 Executed");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
		Sample obj = new Sample();
		obj.method1();
		
		System.out.println("Ths Class Name is :"+obj.getClass().getName());

	}

}
